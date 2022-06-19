package edu.UADE.Modelo;

public interface Observable {
    public void notificar();
    public void agregar(Observer observer);
    public void eliminar(Observer observer);
}
