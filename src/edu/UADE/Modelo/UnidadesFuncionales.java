package edu.UADE.Modelo;

import java.util.ArrayList;
import java.util.List;

public class UnidadesFuncionales{
    private int idUnidad;
    private double porcentajeTotalPagar;
    private TipoUnidad tipoUnidad;
    private ArrayList<Usuario> duenios;
    private ArrayList<Usuario> inquilinos;
    private Double deudaPeriodoAnterior;
    private Double deudaPeriodoActual = 0.0;
    private Double metrosCuadrados;
    private boolean alquilado;

    public UnidadesFuncionales(int idUnidad,TipoUnidad tipoUnidad, double metrosCuadrados,boolean alquilado, double porcentajeTotalPagar,
                               double deudaPeriodoAnterior, ArrayList<Usuario> duenios, ArrayList<Usuario> inquilinos) {
        this.idUnidad = idUnidad;
        this.tipoUnidad = tipoUnidad;
        this.metrosCuadrados = metrosCuadrados;
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

    public double getPorcentajeTotalPagar() {
        return this.porcentajeTotalPagar;
    }

    public Double getDeudaPeriodoAnterior() {
        return this.deudaPeriodoAnterior;
    }

    public TipoUnidad getTipoUnidad() {
        return this.tipoUnidad;
    }

    public Double getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public Double getDeudaPeriodoActual() {
        return this.deudaPeriodoActual;
    }

    public void setDeudaPeriodoActual(Double deudaPeriodoActual) {
        this.deudaPeriodoActual = deudaPeriodoActual;
    }

    public void setDeudaPeriodoAnterior(Double deudaPeriodoAnterior) {
        this.deudaPeriodoAnterior = deudaPeriodoAnterior;
    }

    public boolean getTieneAlquiler(){
        return alquilado;
    }

    public List<Observer> usuariosParaNotificar() {
        List<Observer> usuarios = new ArrayList<Observer>(inquilinos);
        usuarios.addAll(duenios);
        return usuarios;
    }

    public void agregarInquilino(Usuario inquilino){
        this.inquilinos.add(inquilino);
    }
    public void agregarDuenio(Usuario duenio){
        this.duenios.add(duenio);
    }
    public void eliminarInquilino(Usuario inquilino){
        this.inquilinos.remove(inquilino);
    }
    public void eliminarDuenio(Usuario duenio){
        this.duenios.remove(duenio);
    }

    public int getId() {
        return this.idUnidad;
    }
}
