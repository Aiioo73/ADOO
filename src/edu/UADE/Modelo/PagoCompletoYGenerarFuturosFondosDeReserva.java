package edu.UADE.Modelo;

import java.util.List;

public class PagoCompletoYGenerarFuturosFondosDeReserva extends Criterios{


    @Override
    public void divisionDeExpensas(List<UnidadesFuncionales> unidades, double totalGastos) {
        int cantUnidades = unidades.size();
        int metrosTotales = 0;
        //Agrego 0.1 como futuros fondos de reserva
        double totalGastosYReservas = totalGastos * 0.1;
        for (int i = 0; i < cantUnidades; i++) {
            metrosTotales += unidades.get(i).getMetrosCuadrados();
        }
        for (int i = 0; i < cantUnidades; i++) {
            double porcentaje = unidades.get(i).getMetrosCuadrados()/metrosTotales;
            double deuda = totalGastosYReservas * porcentaje;
            unidades.get(i).setDeudaPeriodoAnterior(unidades.get(i).getDeudaPeriodoActual() + unidades.get(i).getDeudaPeriodoAnterior());
            unidades.get(i).setDeudaPeriodoActual(deuda);
        }
    }
}
