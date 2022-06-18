package edu.UADE.Servicios;

public class NotificacionesPorWhatsApp implements EstrategiaDeNotificacion{

    private AdapterNotificadorWhatsApp adapter;

    public NotificacionesPorWhatsApp(AdapterNotificadorWhatsApp adapter) {
        this.adapter = adapter;
    }
    public void setAdapter(AdapterNotificadorWhatsApp newAdapter){
        this.adapter = newAdapter;
    }
    public void enviar(Notificaciones notificaciones){
        this.adapter.enviarWhats(notificaciones);
    }
}