package edu.UADE.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Consorcio {
    private CuentaBancaria cuentaBancaria;
    private List<UnidadesFuncionales> unidadFuncional;
    private List<Gasto> gasto;

    public Consorcio(CuentaBancaria cuentaBancaria, ArrayList<UnidadesFuncionales> unidadFuncional,
                     ArrayList<Gasto> gasto) {
        this.cuentaBancaria = cuentaBancaria;
        this.unidadFuncional = unidadFuncional;
        this.gasto = gasto;
    }

    public void calcularExpensasXUnidadFuncional(){

    }

    public void seleccionarCriterio(Criterios criterios){
    }

    public void cargarGasto(Consorcio consorcio, Gasto gasto){

    }


}
