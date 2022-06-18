package edu.UADE.Servicios;

public class NotificacionesPorMail implements EstrategiaDeNotificacion{
    private AdapterNotificadorMail adapter;

    public NotificacionesPorMail(AdapterNotificadorMail adapter) {
        this.adapter = adapter;
    }
    public void setAdapter(AdapterNotificadorMail newAdapter){
        this.adapter = newAdapter;
    }
    public void enviar(Notificaciones notificaciones){
        this.adapter.enviarMail(notificaciones);
    }

}
