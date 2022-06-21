package edu.UADE.Modelo;

import java.util.Date;

public class AdaptadaObtenerSaldo implements AdapterObtenerSaldo {
    private String tokenSeguridad;

    @Override
    public double calcularSaldoActual(String cbu, String alias, Date fechaSaldo) {
        return 10000;
    }
}


