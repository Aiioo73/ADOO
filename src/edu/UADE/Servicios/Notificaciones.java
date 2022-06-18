package edu.UADE.Servicios;

import edu.UADE.Modelo.Expensa;

public class Notificaciones {
    private String emailDestinatario;
    private Expensa mensajeExpensa;
    private int nroTelefonoDestinatario;

    public Notificaciones(String emailDestinatario, Expensa mensajeExpensa, int nroTelefonoDestinatario) {
        this.emailDestinatario = emailDestinatario;
        this.mensajeExpensa = mensajeExpensa;
        this.nroTelefonoDestinatario = nroTelefonoDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public Expensa getMensajeExpensa() {
        return mensajeExpensa;
    }

    public int getNroTelefonoDestinatario() {
        return nroTelefonoDestinatario;
    }
}
