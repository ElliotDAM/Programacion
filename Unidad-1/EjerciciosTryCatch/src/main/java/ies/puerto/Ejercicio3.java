package main.java.ies.puerto;
/**
 * Declara un array de 3 elementos e intenta acceder al cuarto elemento.
 * Maneja la excepcion ArrayOutOfBoundsException.
 * @author ElliotDAM
 */
public class Ejercicio3 {
   
    static int[] array = {1,2,3};

    public static void main(String[] args) {
        arrayElementos();
    }
/**
 * Metodo que realiza la funcion de acceder a una de las posiciones del array.
 * Se utiliza try-catch para el momento en el que se ingrese un 4.
 */
    public static void arrayElementos(){

        int posicionFallida = 3;
        try {
            int valorArray = array[posicionFallida];
            System.out.println("Numero en la posicion del array indicada:"+valorArray+".");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Intentas acceder a una posicion inexistente en el array.");
        }
        
        
    }
}
