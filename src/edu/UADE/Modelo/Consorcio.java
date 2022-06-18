package edu.UADE.Modelo;

import java.util.ArrayList;

public class Consorcio {
    private CuentaBancaria cuentaBancaria;
    private ArrayList<UnidadesFuncionales> unidadFuncional;
    private Criterios criterios;
    private ArrayList<Gasto> gasto;

    public Consorcio(CuentaBancaria cuentaBancaria, ArrayList<UnidadesFuncionales> unidadFuncional, Criterios criterios, ArrayList<Gasto> gasto) {
        this.cuentaBancaria = cuentaBancaria;
        this.unidadFuncional = unidadFuncional;
        this.criterios = criterios;
        this.gasto = gasto;
    }

    public void calcularExpensasXUnidadFuncional(){

    }

    public void cambioCriterio(Criterios criterios){

    }

    public void cargarGasto(Consorcio consorcio, Gasto gasto){

    }


}
