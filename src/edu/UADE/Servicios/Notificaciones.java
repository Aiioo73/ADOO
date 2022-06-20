package edu.UADE.Servicios;

import edu.UADE.Modelo.Expensa;
import edu.UADE.Modelo.Gasto;

import java.util.Iterator;
import java.util.List;

public class Notificaciones {
    private String emailDestinatario;
    private List<Gasto> mensajeExpensas;
    private String nroTelefonoDestinatario;

    public Notificaciones(String emailDestinatario, List<Gasto> mensajeExpensas, String nroTelefonoDestinatario) {
        this.emailDestinatario = emailDestinatario;
        this.mensajeExpensas = mensajeExpensas;
        this.nroTelefonoDestinatario = nroTelefonoDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getMensajeExpensa() {

        String mensajeParcial = "";
        Iterator<Gasto> it = mensajeExpensas.listIterator();
        while(it.hasNext()){
            Gasto gasto = it.next();
            Expensa expensaActual = gasto.getExpensa();
            mensajeParcial = mensajeParcial + String.format(
                    "\n- Fecha: %s\n- Descripcion: %s\n- Valor Ordinario: %s\n- Valor ExtraOrdinario: %s\n",
                    expensaActual.getFecha(),
                    expensaActual.getDescripcion(),
                    expensaActual.getValorOrdinario(),
                    expensaActual.getValorExtraOrdinario()
            );
        }
        return String.format("\nDetalle de Expensas: %s", mensajeParcial);
    }

    public String getNroTelefonoDestinatario() {
        return nroTelefonoDestinatario;
    }
}
