package edu.UADE.Servicios;

public class AdaptadaWhatsapp implements AdapterNotificadorWhatsApp {

    public void enviarWhats(Notificaciones notificaciones) {
            System.out.println("Enviando Whatsapp a " +
                    notificaciones.getNroTelefonoDestinatario()+ ":" +
                    notificaciones.getMensajeExpensa()
            );
    }
}