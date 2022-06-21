package edu.UADE.Modelo;

import java.util.List;
import java.util.ListIterator;

public class PagoCompletoConFondoDeReserva extends Criterios{

    @Override
    public void divisionDeExpensas(List<UnidadesFuncionales> unidades, double totalGastos) {
        ListIterator<UnidadesFuncionales> uf = unidades.listIterator();
        while(uf.hasNext()){
            UnidadesFuncionales unidadActual = uf.next();
            unidadActual.setDeudaPeriodoActual(0.0);
        }


    }
}
