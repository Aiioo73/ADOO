package edu.UADE.Modelo;

import java.util.ArrayList;
import java.util.List;

public class UnidadesFuncionales {
    private double porcentajeTotalPagar;
    private TipoUnidad tipoUnidad;
    private ArrayList<Usuario> duenios;
    private ArrayList<Usuario> inquilinos;
    private Double deudaPeriodoAnterior;
    private Double metrosCuadrados;
    private boolean alquilado;

    public UnidadesFuncionales(TipoUnidad tipoUnidad, double metrosCuadrados,boolean alquilado, double porcentajeTotalPagar,
                               double deudaPeriodoAnterior, ArrayList<Usuario> duenios, ArrayList<Usuario> inquilinos) {

        this.tipoUnidad = tipoUnidad;
        this.porcentajeTotalPagar = porcentajeTotalPagar;
        this.deudaPeriodoAnterior = deudaPeriodoAnterior;
        this.alquilado = alquilado;
        this.duenios = duenios;
        this.inquilinos = inquilinos;

    }

    public void tieneAlquiler(){
        if (alquilado == true){
            TipoUsuario inquilino = TipoUsuario.INQUILINO;
        }
    }

    public void calcularMetrosCuadrados(){

    }

    public double getPorcentajeTotalPagar() {
        return porcentajeTotalPagar;
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

    public boolean getTieneAlquiler(){
        return alquilado;
    }

}
