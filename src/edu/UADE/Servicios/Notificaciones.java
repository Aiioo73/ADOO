package edu.UADE.Servicios;

public class Notificaciones {
    private String emailDestinatario;
    private int unidadFuncional;
    private Double mensajeExpensas;
    private Double deudaAnterior;
    private String nroTelefonoDestinatario;

    public Notificaciones(String emailDestinatario, int idUnidad, Double mensajeExpensas, Double deudaPeriodoAnterior, String nroTelefonoDestinatario) {
        this.unidadFuncional = idUnidad;
        this.emailDestinatario = emailDestinatario;
        this.mensajeExpensas = mensajeExpensas;
        this.deudaAnterior = deudaPeriodoAnterior;
        this.nroTelefonoDestinatario = nroTelefonoDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getMensajeExpensa() {
        return String.format(
                "\n- Los gastos del corriente periodo para su Unidad Funcional con ID %s son de: %s \n- El monto adeudado para su Unidad Funcional es de: %s\n",
                this.unidadFuncional,
                this.mensajeExpensas,
                this.deudaAnterior
        );
    }

    public String getNroTelefonoDestinatario() {
        return nroTelefonoDestinatario;
    }
}
