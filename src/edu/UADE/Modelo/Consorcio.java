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
        this.observers = new ArrayList<>();
    }

    public void actualizarObservers(){
        ListIterator<UnidadesFuncionales> itUnidades = unidadFuncional.listIterator();
        while (itUnidades.hasNext()){
            UnidadesFuncionales unidadActual = itUnidades.next();
            System.out.println(unidadActual);
            List <Usuario>usuarios = unidadActual.usuariosParaNotificar();

            for(Usuario actual: usuarios){
                if(this.observers.isEmpty() || !this.observers.contains(actual)){
                    this.agregarObserver(actual);
                }
            }
        }
    }
    public void notificar(){


        this.actualizarObservers();

        ListIterator<Observer> itObserver = observers.listIterator();

        while(itObserver.hasNext()){
            Observer current = itObserver.next();

            String email = current.getEmail();
            String tel = current.getTelefono();
            List<MedioNotificacion> medio = current.getMedioNotificacion();

            Notificaciones notificacion = new Notificaciones(email,gasto,tel);

            //Un usuario puede tener mas de un medio de notificacion pero por defecto se usa el primero de la lista.
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
    public void agregarObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void eliminarObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public void agregarUnidadFuncional(UnidadesFuncionales uf) {
        this.unidadFuncional.add(uf);
    }
    public void eliminarUnidadFuncional(UnidadesFuncionales uf) {
        List <Usuario> observersParaEliminar = uf.usuariosParaNotificar();
        for(Usuario actual: observersParaEliminar){
            if(!this.observers.isEmpty()){this.observers.remove(actual);}
        }
        this.unidadFuncional.remove(uf);
    }

    public void calcularExpensasXUnidadFuncional(){

    }

    public void cambiarCriterio(Criterios nuevoCriterio){
        this.criterio = nuevoCriterio;
    }

    public void cargarGasto(Gasto gasto){
        this.gasto.add(gasto);
    }


}
