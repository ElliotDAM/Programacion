package ies.puerto;

/**
 * Clase creada para la busqueda de la posicion de un elemento
 * @author ElliotDAM
 */
public class Ejercicio1 {
/**
 * Metodo que busca la posicion media de un elemento.
 * @param array
 * @param posicion
 * @return medio del array.
 */
    public int busquedaBinaria(int[] array, int posicion){

        int inicio = array[0];
        int finalArray = array.length -1;

        while (inicio <= finalArray){
            int medio = (inicio + finalArray) / 2;
            if (array[medio] == posicion){
                return medio;
            } else if (array[medio] < posicion){
                inicio = medio + 1;
            }else{
                finalArray = medio - 1;
            }
        }
        return -1;

    }
}