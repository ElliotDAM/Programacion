package ies.puerto;

/**
 * Clase realizada para ordenar en burbuja un array dado.
 * @author ElliotDAM
 */
public class Ejercicio2{

    /**
     * Metodo realizado para la ordenacion en burbuja de un array desordenado.
     * @param array
     * @return array ordenado
     */
    public int[] ordenacionBurbujaArray(int[] array){

        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1]=aux;
                }

            }

        }

        return array;
    }
}