package edu.UADE.Modelo;

import java.util.ArrayList;

public class UnidadesFuncionales {
    private double porcentajeTotalPagar;
    private ArrayList<Persona> inquilinos;
    private ArrayList<Persona> propietarios;
    private Double deudaPeriodoAnterior;
    private TipoUnidad tipoUnidad;
    private Double metrosCuadrados;

    public UnidadesFuncionales(double porcentajeTotalPagar, ArrayList<Persona> inquilinos, ArrayList<Persona> propietarios, Double deudaPeriodoAnterior, TipoUnidad tipoUnidad, Double metrosCuadrados) {
        this.porcentajeTotalPagar = porcentajeTotalPagar;
        this.inquilinos = inquilinos;
        this.propietarios = propietarios;
        this.deudaPeriodoAnterior = deudaPeriodoAnterior;
        this.tipoUnidad = tipoUnidad;
    }

    public double getPorcentajeTotalPagar() {
        return porcentajeTotalPagar;
    }

    public ArrayList<Persona> getInquilinos() {
        return inquilinos;
    }

    public ArrayList<Persona> getPropietarios() {
        return propietarios;
    }

    public Double getDeudaPeriodoAnterior() {
        return deudaPeriodoAnterior;
    }

    public TipoUnidad getTipoUnidad() {
        return tipoUnidad;
    }

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }
}
