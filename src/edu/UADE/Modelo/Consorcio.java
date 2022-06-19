package edu.UADE.Modelo;

import edu.UADE.Servicios.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Consorcio implements Observable{
    private CuentaBancaria cuentaBancaria;
    private List<UnidadesFuncionales> unidadFuncional;
    private List<Gasto> gasto;
    private Criterios criterio;
    private List<Observer> observers;
    private final Sender notificationSender = new Sender();

    public Consorcio(CuentaBancaria cuentaBancaria, ArrayList<UnidadesFuncionales> unidadFuncional,
                     ArrayList<Gasto> gasto) {
        this.cuentaBancaria = cuentaBancaria;
        this.unidadFuncional = unidadFuncional;
        this.gasto = gasto;
    }

    public void notificar(){
        ListIterator<Observer> it = observers.listIterator();
        while(it.hasNext()){
            Observer current = it.next();

            String email = current.getEmail();
            String tel = current.getTelefono();
            List<MedioNotificacion> medio = current.getMedioNotificacion();

            //TODO: CAMBIAR EXPENSA DUMMY POR EXPENSA REAL
            Expensa expensa = new Expensa(new Date(), 1100,1100);

            Notificaciones notificacion = new Notificaciones(email,expensa,tel);

            //TODO: VER SI ES POSIBLE REEMPLAZAR EL SWITCH POR ALGO MAS ELEGANTE
            switch(medio.get(0)){
                case SMS:
                    this.notificationSender.cambiarEstrategiaDeNotificacion(new NotificacionesPorSMS());
                    break;
                case WHATSAPP:
                    this.notificationSender.cambiarEstrategiaDeNotificacion(new NotificacionesPorWhatsApp());
                    break;
                case EMAIL:
                    this.notificationSender.cambiarEstrategiaDeNotificacion(new NotificacionesPorMail());
                    break;
            }

            this.notificationSender.enviar(notificacion);
        }
    }

    @Override
    public void agregar(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void eliminar(Observer observer) {
        this.observers.remove(observer);
    }

    public void calcularExpensasXUnidadFuncional(){

    }

    public void seleccionarCriterio(Criterios nuevoCriterio){
        this.criterio = nuevoCriterio;
    }

    public void cargarGasto(Consorcio consorcio, Gasto gasto){

    }


}
