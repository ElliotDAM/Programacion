package main.java.ies.puerto;
/**
 * Crea un metodo que acepte un numero y maneja la excepcion IllegalArgumentException si el numero es negativo.
 * @author ElliotDAM
 */
public class Ejercicio7 {
    public static void main(String[] args) throws Exception{
        int numero = -3;
        try {
            numero = comprobarNumero(numero); 
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Mensaje de error:"+comprobarNumero.illegalArgumentException.getMessage());
        }
    }
/**
 * Metodo que pide un numero, la cual solo acepta positivos.
 * @param numero
 * @return resultado del numero
 */
    public static int comprobarNumero(int numero){
        
       if(numero < 0){
        throw new IllegalArgumentException("No puede ser un numero negativo.");
       }
       return numero;

    }

}
