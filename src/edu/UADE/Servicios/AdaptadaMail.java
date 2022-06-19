package edu.UADE.Servicios;

public class AdaptadaMail implements AdapterNotificadorMail {

    public void enviarMail(Notificaciones notificaciones) {
            System.out.println("Enviando Email a " +
                    notificaciones.getEmailDestinatario()+ ":" +
                    notificaciones.getMensajeExpensa()
            );
    }
}