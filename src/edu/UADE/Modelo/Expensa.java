package edu.UADE.Modelo;

import java.util.Date;

public class Expensa {
    private Date fecha;
    private String descripcion;
    private double valorOrdinario;
    private double valorExtraOrdinario;

    public Expensa(Date fecha, String descripcion, double valorOrdinario, double valorExtraOrdinario) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.valorOrdinario = valorOrdinario;
        this.valorExtraOrdinario = valorExtraOrdinario;
    }
    public Date getFecha() {
        return fecha;
    }
    public String getDescripcion(){ return descripcion; }
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
