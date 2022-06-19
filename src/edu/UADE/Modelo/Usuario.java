package edu.UADE.Modelo;
import java.util.List;

public class Usuario extends Persona implements Observer{

    private String usuario;
    private String password;
    private TipoUsuario tipo;
    private String email;
    private String telefono;
    private List<MedioNotificacion> medios;
    IAdapterOAuth adapter;


    public Usuario(String nombre, String apellido, int dni, Domicilio domicilio, TipoUsuario tipo) {
        super(nombre, apellido, dni, domicilio);
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public List<MedioNotificacion> getMedioNotificacion() {
        return medios;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<MedioNotificacion> getMedios() {
        return medios;
    }

    public void setMedios(List<MedioNotificacion> medios) {
        this.medios = medios;
    }
}
