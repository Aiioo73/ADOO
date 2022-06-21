package edu.UADE.Modelo;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDeConsoricio {

    private ArrayList<Consorcio> listadoConsorcio;

    public AdministradorDeConsoricio(ArrayList<Consorcio> listadoConsorcio) {
        this.listadoConsorcio = listadoConsorcio;
    }

    public void confirmarPagoUnidadFuncional(UnidadesFuncionales unidadesFuncionales, Double pagoDeuda){
        unidadesFuncionales.setDeudaPeriodoAnterior(unidadesFuncionales.getDeudaPeriodoAnterior() - pagoDeuda);
        unidadesFuncionales.setDeudaPeriodoActual(0.0);
    }

    public void vencimientoExpensas(){

    }

    public void cargarGasto(Gasto gasto, Consorcio consorcio){
        if (this.listadoConsorcio.contains(consorcio)) {
            consorcio.cargarGasto(gasto);
        }else{
            System.out.println("El consorcio no te pertenece");
        }
    }
}
