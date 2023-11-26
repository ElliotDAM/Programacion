package main.java.ies.puerto;
/**
 * Crea un programa que intente acceder a un metodo de un objeto que es null. Por ejemplo, String.
 * Maneja la excepcion NullPointerException.
 * @author ElliotDAM
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        accederMetodo();
    }

    public static void accederMetodo(){
        String palabra = null;
        try {
            String mayuscula = palabra.toUpperCase();
            System.out.println("Palabra en mayuscula:"+mayuscula+".");
        } catch (NullPointerException nullPointerException) {
            System.out.println("No puedes tratar con la palabra si su valor es null.");
        }
    }

}
