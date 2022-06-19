package edu.UADE.Modelo;

import java.util.Date;

public class AdaptadaObtenerSaldo implements AdapterObtenerSaldo {
    private String tokenSeguridad;

    @Override
    public double calcularSaldoActual(int cbu, String alias, Date fechaSaldo) {
        return 0;
    }
}


