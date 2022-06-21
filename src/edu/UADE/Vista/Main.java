package edu.UADE.Vista;

import edu.UADE.Modelo.*;
import edu.UADE.Servicios.Notificaciones;
import edu.UADE.Servicios.NotificacionesPorMail;
import edu.UADE.Servicios.NotificacionesPorSMS;
import edu.UADE.Servicios.Sender;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static edu.UADE.Modelo.MedioNotificacion.EMAIL;
import static edu.UADE.Modelo.MedioNotificacion.SMS;

public class Main {

    public static void main(String[] args) {
        //Instancio la fecha actual
        Date objDate = new Date();

        List<MedioNotificacion> medios1 = new ArrayList<MedioNotificacion>();
        List<MedioNotificacion> medios2 = new ArrayList<MedioNotificacion>();
        medios1.add( SMS );
        medios2.add( EMAIL );

        //Instancio un Administrador de Consorcio
        Domicilio DomicilioAlberto = new Domicilio("Av Libertador", 1234, "CABA", "BS.AS.");
        Usuario userAlberto = new Usuario("Alberto", "Gomez", 12345678, DomicilioAlberto,
                TipoUsuario.ADMINISTRADORDECONSORCIO, "albertogomez@gmail.com", "123456789", medios1);
        userAlberto.setUsuario("albert123");
        userAlberto.setPassword("123abc");


        //Creo Expensas
        Expensa Luz = new Expensa(objDate, "Luz",1500, 0);
        Expensa Gas = new Expensa(objDate, "Gas",300, 0);
        Expensa Calefon = new Expensa(objDate, "Calefon",0, 1200);
        Expensa Reparacion = new Expensa(objDate, "reparacion", 0, 4000);


        //Creo usuarios para llenar inquilinos y dueños
        Domicilio domicilioInq1 = new Domicilio("Av Libertador", 1234, "CABA", "BS.AS.");
        Usuario userInq1 = new Usuario("Carlos", "Gomez", 12345678, domicilioInq1,
                TipoUsuario.INQUILINO, "carlitos@gmail.com", "987654321", medios2);
        userAlberto.setUsuario("albert123");
        userAlberto.setPassword("123abc");
        Usuario userInq2 = new Usuario("Maria", "Ladelfa", 12345678, domicilioInq1,
                TipoUsuario.INQUILINO, "maria.ladelfa@hotmail.com", "123789456", medios1);
        userAlberto.setUsuario("albert123");
        userAlberto.setPassword("123abc");

        Usuario userDue1 = new Usuario("Marcos", "Perez", 12345678, domicilioInq1,
                TipoUsuario.DUENO, "marquitos.perez@outlook.com", "456789123", medios2);
        userAlberto.setUsuario("albert123");
        userAlberto.setPassword("123abc");

        ArrayList<Usuario> inquilinos1 = new ArrayList<>();
        ArrayList<Usuario> inquilinos2 = new ArrayList<>();
        inquilinos1.add(userInq1);
        inquilinos2.add(userInq2);

        ArrayList<Usuario> duenios = new ArrayList<>();
        duenios.add(userDue1);


        //Creo Unidades Funcionales
        UnidadesFuncionales Depto1 = new UnidadesFuncionales(1, TipoUnidad.departamento, 23.2, false, 20.0, 0.0, inquilinos1, duenios);
        UnidadesFuncionales Depto2 = new UnidadesFuncionales(2, TipoUnidad.departamento, 38.0, true, 40.0, 1200.0, inquilinos2, duenios);
        UnidadesFuncionales Cochera = new UnidadesFuncionales( 3, TipoUnidad.cochera, 12.6, true, 30.0, 10000.0, inquilinos1, duenios);

        //Creo Cuentas Bancarias
        CuentaBancaria CTA0001 = new CuentaBancaria("655232324","Alberto Gomez",
                209877662,98020,"albert123Galicia",objDate);
        CuentaBancaria CTA0002 = new CuentaBancaria("755232324","Susana Gimenez",
                309877662,128020,"HolaSusana",objDate);

        //Creo Gastos
        Gasto luz = new Gasto(Luz,true);
        Gasto gas = new Gasto(Gas,true);
        Gasto calefon = new Gasto(Calefon,true);
        Gasto reparacion = new Gasto(Reparacion, false);

        //Creo Criterios
        Criterios criterio1 = new PagoCompletoConFondoDeReserva();


        //Creo Consorcios
        ArrayList <UnidadesFuncionales> uf = new ArrayList<UnidadesFuncionales>();
        ArrayList <Gasto> gasto = new ArrayList<Gasto>();
        Consorcio numero1 = new Consorcio(CTA0001,uf,gasto);
        numero1.cambiarCriterio(criterio1);

        //Creo AdministradorDeConsorcio (diff de usuario tipo AdministradorDeConsorcio)
        ArrayList<Consorcio> consorcios = new ArrayList<Consorcio>();
        consorcios.add(numero1);
        AdministradorDeConsoricio Alberto = new AdministradorDeConsoricio(consorcios);

        //Agrego Unidades Funcionales a cada consorcio
        numero1.agregarUnidadFuncional(Depto1);
        numero1.agregarUnidadFuncional(Depto2);
        numero1.agregarUnidadFuncional(Cochera);

        //REQ1 Cargar Gastos de cada mes por parte del Administrador
        numero1.cargarGasto(reparacion);

        //REQ2 Cargar Gastos Recurrentes por parte del Administrador
        numero1.cargarGasto(calefon);

        //REQ3 Calcular y Generar las Expensas en Forma Mensual, según el criterio seleccionado.
        numero1.cambiarCriterio(new PagoCompletoDeGastos());
        numero1.calcularExpensasXUnidadFuncional();

        //REQ4 Enviar las Expensas a cada interesado según el medio de notificación seleccionado.
        numero1.notificar();

        //Pago de Deuda de una unidad funcional
        numero1.confirmarPagoUnidadFuncional(Depto1, 0.0);
        numero1.confirmarPagoUnidadFuncional(Cochera, 1200.0);

        System.out.println("Notificaciones luego de efectuar el pago: \n");

        numero1.notificar();

    }
}
