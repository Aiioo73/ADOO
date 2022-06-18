package edu.UADE.Servicios;

public class AdaptadaSMS implements AdapterNotificadorSMS {

    public void enviarSMS(Notificaciones notificaciones) {
            System.out.println("Enviando SMS a " +
                    notificaciones.getNroTelefonoDestinatario()+ " por SMS: " +
                    "'" + notificaciones.getMensajeExpensa() + "'"
            );
    }
}