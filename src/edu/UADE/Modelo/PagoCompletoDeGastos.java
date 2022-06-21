package edu.UADE.Modelo;

import java.util.List;

public class PagoCompletoDeGastos extends Criterios{

    @Override
    public void divisionDeExpensas(List<UnidadesFuncionales> unidades, double totalGastos) {
        int cantUnidades = unidades.size();
        int metrosTotales = 0;
        for (int i = 0; i < cantUnidades; i++) {
            metrosTotales += unidades.get(i).getMetrosCuadrados();
        }
        for (int i = 0; i < cantUnidades; i++) {
            double porcentaje = unidades.get(i).getMetrosCuadrados()/metrosTotales;
            double deuda = totalGastos * porcentaje;
            unidades.get(i).setDeudaPeriodoAnterior(unidades.get(i).getDeudaPeriodoActual() + unidades.get(i).getDeudaPeriodoAnterior());
            unidades.get(i).setDeudaPeriodoActual(deuda);
        }

    }

}
