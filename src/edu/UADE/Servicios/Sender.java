package edu.UADE.Servicios;

public class Sender {
    private EstrategiaDeNotificacion estrategiaDeNotificacion;

    public void enviar(Notificaciones notificaciones){
        this.estrategiaDeNotificacion.enviar(notificaciones);
    }
    public void cambiarEstrategiaDeNotificacion(EstrategiaDeNotificacion nuevaEstrategia){
        this.estrategiaDeNotificacion = nuevaEstrategia;
    }
}
