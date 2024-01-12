package ies.puerto.Acceso;

public class Autenticacion {
    public boolean validacion(String usuario, String contrasenia){
        return usuario.equals("usuario") && contrasenia.equals("contrasenia");
    }

    @Override
    public String toString() {
        return "Autenticacion []";
    }
}

    