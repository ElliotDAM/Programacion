/**
 * Clase realizada para buscar un elemento dado dentro de un array
 * @author ElliotDAM
 */

public class Ejercicio5{
    /**
     * Metodo que se utiliza para buscar si existe un valor dentro de un array y su posicion.
     * @param valor que introduce el usuario
     * @return 
     */
    public int posicionArray(int valor){

        int[] array = {10, 30, 60, 90, 100};

        for (int i = 0; i < array.length ; i++) {
            if (valor == array[i]){
                int posicion = i;
                System.out.println("El valor " + valor + " se encuentra en la posicion " + posicion + ".");
            }
        }
    }
}