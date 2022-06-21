package edu.UADE.Modelo;

import java.util.List;
import java.util.ListIterator;

public class PagoCompletoConFondoDeReserva extends Criterios{

    @Override
    public void divisionDeExpensas(List<UnidadesFuncionales> unidades, double totalGastos) {
        int cantUnidades = unidades.size();
        for (int i = 0; i < cantUnidades; i++) {
            unidades.get(i).setDeudaPeriodoActual(0.0);
        }
        //TODO check si descontamos monto del banco
    }
}
