package ies.puerto;

import java.util.Arrays;

/**
 * Clase dedicada a la ordenacion de un array en forma ascendente.
 * @author ElliotDAM
 */
public class Ejercicio7{

    public int[] ordenAscendente(int[] array){

        //int[] array = {7,3,25,4,18};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j]=array[j+1];
                    array[j+1]= aux;
                }
            }
        }
        return array;
        
    }

    /*public void mostrarArrayOrdenado(){

        int[] resultado = ordenAscendente();
        System.out.println(Arrays.toString(resultado));
    }*/
}