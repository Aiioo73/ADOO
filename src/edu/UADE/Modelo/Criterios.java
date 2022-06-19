package edu.UADE.Modelo;

public abstract class Criterios {
    private IEstrategiaCriterio estrategiaCriterio;


    public void obtencionDeSaldo(){

    }

    public void calculoDeGasto(){

    }

    public void divisionDeExpensa(){
        this.estrategiaCriterio.divisionDeExpensas();
    }

    public void cambioEstrategiaCriterio(IEstrategiaCriterio nuevaEstrategiaCriterio){
        this.estrategiaCriterio = nuevaEstrategiaCriterio;
    }

}

