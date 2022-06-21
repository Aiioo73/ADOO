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

    public void notificar() {

        Notificaciones notificacion;
        for (UnidadesFuncionales unidadActual: unidadFuncional) {
            List<Observer> usuarios = unidadActual.usuariosParaNotificar();
            for (Observer actual : usuarios) {
                if (this.observers.isEmpty() || !this.observers.contains(actual)) {
                    this.agregarObserver(actual);
                }
                String email = actual.getEmail();
                String tel = actual.getTelefono();
                List<MedioNotificacion> medio = actual.getMedioNotificacion();
                notificacion = new Notificaciones(email, unidadActual.getId() , unidadActual.getDeudaPeriodoActual(), unidadActual.getDeudaPeriodoAnterior(), tel);
                this.enviarNotificacionSegunEstrategia(notificacion, medio);
            }
        }
    }
    public void enviarNotificacionSegunEstrategia(Notificaciones notificacion, List<MedioNotificacion> medio){
        //Un usuario puede tener mas de un medio de notificacion pero por defecto se usa el primero de la lista.
        switch (medio.get(0)) {
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

    public void confirmarPagoUnidadFuncional(UnidadesFuncionales unidadesFuncionales, Double pagoDeuda){
        unidadesFuncionales.setDeudaPeriodoAnterior(unidadesFuncionales.getDeudaPeriodoAnterior() - pagoDeuda);
        unidadesFuncionales.setDeudaPeriodoActual(0.0);
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
        List <Observer> observersParaEliminar = uf.usuariosParaNotificar();
        for(Observer actual: observersParaEliminar){
            if(!this.observers.isEmpty()){this.observers.remove(actual);}
        }
        this.unidadFuncional.remove(uf);
    }

    public void calcularExpensasXUnidadFuncional(){
        Double gastosTotales = this.criterio.calculoDeGasto(this.gasto);

        if(this.criterio instanceof PagoCompletoConFondoDeReserva){
            Double saldoCuentaBancaria = this.criterio.obtencionDeSaldo(this.cuentaBancaria.getCbu(), this.cuentaBancaria.getAlias(), this.cuentaBancaria.getFechaSaldo());
            if (saldoCuentaBancaria < gastosTotales){
                System.out.println("El saldo en la cuenta bancaria del consorcio no cubre el total de los gastos");
                System.exit(1);
            }
        }

        this.criterio.divisionDeExpensas(unidadFuncional, gastosTotales);
    }

    public void cambiarCriterio(Criterios nuevoCriterio){
        this.criterio = nuevoCriterio;
    }

    public void cargarGasto(Gasto gasto){
        this.gasto.add(gasto);
    }


}
