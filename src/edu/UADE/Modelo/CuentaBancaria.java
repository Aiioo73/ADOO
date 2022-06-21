package edu.UADE.Modelo;

import java.util.Date;

public class CuentaBancaria {
    private String cbu;
    private String titularCuenta;
    private int cuit;
    private double saldoActual;
    private String alias;
    private Date fechaSaldo;

    public CuentaBancaria(String cbu, String titularCuenta, int cuit, double saldoActual, String alias, Date fechaSaldo) {
        this.cbu = cbu;
        this.titularCuenta = titularCuenta;
        this.cuit = cuit;
        this.saldoActual = saldoActual;
        this.alias = alias;
        this.fechaSaldo = fechaSaldo;
    }

    public double obtenerSaldo(int cbu, String alias, Date fechaSaldo){

        return saldoActual;
    }

    public String getCbu() {
        return cbu;
    }

    public String getAlias() {
        return alias;
    }

    public Date getFechaSaldo() {
        return fechaSaldo;
    }
}
