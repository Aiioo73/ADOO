package edu.UADE.Modelo;

import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public abstract class Criterios {
    private AdapterObtenerSaldo adapterSaldo = new AdaptadaObtenerSaldo();
    public double obtencionDeSaldo( String cbu , String alias, Date fecha){
        return this.adapterSaldo.calcularSaldoActual(cbu, alias, fecha);
    }

    //TODO: Actualizar diagrama , ahora recibe una lista
    public double calculoDeGasto(List<Gasto> gastos){
        ListIterator<Gasto> listaDeGastos = gastos.listIterator();
        double total = 0;
        while (listaDeGastos.hasNext()){
            Gasto gastoActual = listaDeGastos.next();
            total = total + gastoActual.getMonto();
        }

        return total;
    }

    abstract void divisionDeExpensas(List<UnidadesFuncionales> unidades, double totalGastos);

}

