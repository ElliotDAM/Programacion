package Acceso;

public class Autenticacion{

    public static boolean validacion(String usuario, String contrasenia){
        return usuario.equals("usuario") && contrasenia.equals("contrasenia");
    }
}