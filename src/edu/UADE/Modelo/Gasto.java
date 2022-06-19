package edu.UADE.Modelo;

import java.security.cert.Extension;

public class Gasto {
    private double monto;
    private Expensa tipo;
    private boolean esRecurrente;
    private Consorcio consorcio;

    public Gasto(double monto, Expensa tipo, boolean esRecurrente) {

        this.monto = monto;
        this.tipo = tipo;
        this.esRecurrente = esRecurrente;
    }

    public double getMonto() {
        monto= tipo.getTotal();
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
