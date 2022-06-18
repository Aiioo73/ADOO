package edu.UADE.Modelo;

import java.util.Date;

public class Expensa {
    private Date fecha;
    private double valorOrdinario;
    private double valorExtraOrdinario;

    public Expensa(Date fecha, double valorOrdinario, double valorExtraOrdinario) {
        this.fecha = fecha;
        this.valorOrdinario = valorOrdinario;
        this.valorExtraOrdinario = valorExtraOrdinario;
    }
    public Date getFecha() {
        return fecha;
    }
    public double getValorOrdinario() {
        return valorOrdinario;
    }
    public double getValorExtraOrdinario() {
        return valorExtraOrdinario;
    }
    public double getTotal(){
        return valorOrdinario + valorExtraOrdinario;
    }
}
