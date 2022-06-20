package edu.UADE.Modelo;

public interface Observable {
    public void notificar();
    public void agregarObserver(Observer observer);
    public void eliminarObserver(Observer observer);
}
