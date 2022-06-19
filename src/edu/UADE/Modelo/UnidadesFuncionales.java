package edu.UADE.Modelo;

public class UnidadesFuncionales {
    private double porcentajeTotalPagar;
    private TipoUnidad tipoUnidad;
    private TipoUsuario tipoUsuario;
    private Double deudaPeriodoAnterior;
    private Double metrosCuadrados;
    private boolean alquilado;

    public UnidadesFuncionales(TipoUnidad tipoUnidad,TipoUsuario tipoUsuario, double metrosCuadrados,boolean alquilado, double porcentajeTotalPagar,
                               double deudaPeriodoAnterior) {

        this.tipoUnidad = tipoUnidad;
        this.porcentajeTotalPagar = porcentajeTotalPagar;
        this.deudaPeriodoAnterior = deudaPeriodoAnterior;
        this.tipoUsuario = TipoUsuario.DUENO;
        this.alquilado = alquilado;

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
