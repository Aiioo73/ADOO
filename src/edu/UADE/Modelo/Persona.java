package edu.UADE.Modelo;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private Domicilio domicilio;

    Persona(String nombre, String apellido, int dni, Domicilio domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio= domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
}
