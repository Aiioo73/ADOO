package edu.UADE.Vista;

import edu.UADE.Modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Instancio la fecha actual
        Date objDate = new Date();

        //Instancio un Administrador de Consorcio
        Domicilio DomicilioAlberto = new Domicilio("Av Libertador", 1234, "CABA", "BS.AS.");
        Usuario Alberto = new Usuario("Alberto", "Gomez", 12345678, DomicilioAlberto,
                TipoUsuario.ADMINISTRADORDECONSORCIO);
        Alberto.setUsuario("albert123");
        Alberto.setPassword("123abc");


        //Creo Expensas
        Expensa Luz = new Expensa(objDate, "Luz",1500, 0);
        Expensa Gas = new Expensa(objDate, "Gas",300, 0);
        Expensa Calefon = new Expensa(objDate, "Calefon",0, 1200);

        //Creo Unidades Funcionales
        UnidadesFuncionales Depto1 = new UnidadesFuncionales(TipoUnidad.departamento, TipoUsuario.DUENO, 23.2, false, 20.0, 0.0);
        UnidadesFuncionales Depto2 = new UnidadesFuncionales(TipoUnidad.departamento, TipoUsuario.DUENO, 38.0, true, 40.0, 1200.0);
        UnidadesFuncionales Cochera = new UnidadesFuncionales(TipoUnidad.cochera, TipoUsuario.DUENO, 12.6, true, 30.0, 10000.0);

        //Creo Cuentas Bancarias
        CuentaBancaria CTA0001 = new CuentaBancaria(655232324,"Alberto Gomez",
                209877662,98020,"albert123Galicia",objDate);
        CuentaBancaria CTA0002 = new CuentaBancaria(755232324,"Susana Gimenez",
                309877662,128020,"HolaSusana",objDate);

        //Creo Gastos
        Gasto luz = new Gasto(Luz,true);
        Gasto gas = new Gasto(Gas,true);
        Gasto calefon = new Gasto(Calefon,true);

        //Creo Criterios



        //Creo Consorcios
        ArrayList <UnidadesFuncionales> uf = new ArrayList<UnidadesFuncionales>();
        ArrayList <Gasto> gasto = new ArrayList<Gasto>();
        Consorcio numero1 = new Consorcio(CTA0001,uf,gasto);



        System.out.println(Luz.getFecha());
        System.out.println();


    }
}
