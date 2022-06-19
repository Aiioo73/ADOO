package edu.UADE.Modelo;

public class OAuth implements IAdapterOAuth {
    @Override
    public void autenticar(String usuario, String password, TipoUsuario tipo) {
        if(usuario.equals(null) || password.equals(null) || tipo.equals(null)){
            System.out.println("El usuario No existe");
        }else{
            System.out.println("Usuario válido");
        }
    }
}
