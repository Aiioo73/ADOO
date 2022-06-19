package edu.UADE.Servicios;

public class NotificacionesPorSMS implements EstrategiaDeNotificacion{

    private AdapterNotificadorSMS adapter;

    public NotificacionesPorSMS() {
        this.adapter = new AdaptadaSMS();
    }
    public void setAdapter(AdapterNotificadorSMS newAdapter){
        this.adapter = newAdapter;
    }
    public void enviar(Notificaciones notificaciones){
        this.adapter.enviarSMS(notificaciones);
    }
}
