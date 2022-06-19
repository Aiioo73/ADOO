package edu.UADE.Servicios;

public class NotificacionesPorWhatsApp implements EstrategiaDeNotificacion{

    private AdapterNotificadorWhatsApp adapter;

    public NotificacionesPorWhatsApp() {
        this.adapter = new AdaptadaWhatsapp();
    }
    public void setAdapter(AdapterNotificadorWhatsApp newAdapter){
        this.adapter = newAdapter;
    }
    public void enviar(Notificaciones notificaciones){
        this.adapter.enviarWhats(notificaciones);
    }
}