package edu.UADE.Modelo;

public class Gasto {
    private double monto;
    private Expensa tipo;
    private boolean esRecurrente;

    public Gasto(double monto, Expensa tipo, boolean esRecurrente) {
        this.monto = monto;
        this.tipo = tipo;
        this.esRecurrente = esRecurrente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
