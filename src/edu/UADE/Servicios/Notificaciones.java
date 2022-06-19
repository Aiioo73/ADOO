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

    public String getMensajeExpensa() {
        String mensajeExpensa = String.format(
                "\nDetalle de Expensas:" +
                "\n- Fecha: %s\n" + "- Valor Ordinario: %s\n" + "- Valor ExtraOrdinario: %s\n",
                this.mensajeExpensa.getFecha(),
                this.mensajeExpensa.getValorOrdinario(),
                this.mensajeExpensa.getValorExtraOrdinario()
        );
        return mensajeExpensa;
    }

    public int getNroTelefonoDestinatario() {
        return nroTelefonoDestinatario;
    }
}
