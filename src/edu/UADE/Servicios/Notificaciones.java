package edu.UADE.Servicios;

import edu.UADE.Modelo.Expensa;
import edu.UADE.Modelo.Gasto;

import java.util.Iterator;
import java.util.List;

public class Notificaciones {
    private String emailDestinatario;
    private Double mensajeExpensas;
    private String nroTelefonoDestinatario;

    public Notificaciones(String emailDestinatario, Double mensajeExpensas, String nroTelefonoDestinatario) {
        this.emailDestinatario = emailDestinatario;
        this.mensajeExpensas = mensajeExpensas;
        this.nroTelefonoDestinatario = nroTelefonoDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getMensajeExpensa() {
        return String.format("\n- Los gastos del corriente perido para su Unidad Funcional son de: %s", this.mensajeExpensas);
    }

    public String getNroTelefonoDestinatario() {
        return nroTelefonoDestinatario;
    }
}
