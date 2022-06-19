package edu.UADE.Modelo;

public class Usuario extends Persona {

    private String usuario;
    private String password;
    private TipoUsuario tipo;
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

}
