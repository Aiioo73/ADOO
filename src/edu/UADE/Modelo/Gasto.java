package edu.UADE.Modelo;

import java.security.cert.Extension;

public class Gasto {
    private Expensa tipo;
    private boolean esRecurrente;
    private Consorcio consorcio;

    public Gasto(Expensa tipo, boolean esRecurrente) {
        this.tipo = tipo;
        this.esRecurrente = esRecurrente;
    }
    
    public Double getMonto() {
        return tipo.getTotal();
    }

    public Expensa getExpensa(){
        return tipo;
    }
}
