package edu.UADE.Modelo;

public class Domicilio {
    private String calle;
    private int numero;
    private String entrecalle1;
    private String entrecalle2;
    private String localidad;
    private String provincia;

    public Domicilio(String calle, int numero, String localidad, String provincia){
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getEntrecalle1() {
        return entrecalle1;
    }

    public String getEntrecalle2() {
        return entrecalle2;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }
}
