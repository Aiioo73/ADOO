package edu.UADE.Modelo;

import java.util.List;

public interface Observer {
    public String getEmail();
    public String getTelefono() ;
    public List<MedioNotificacion> getMedioNotificacion();
}
