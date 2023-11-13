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
//Metodo correccion en clase.
/*
    public int[] burbuja(int[] array){
        int tamanio = array.length();
        boolean intercambio;

        do
            intercambio = false;
            for (int i = 1; i < tamanio -1 ; i++) {
                if(array[i-1] > array[i]{
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i-1] = aux;
                    intercambio = true;
                }
            }
        while(intercambio);


    }
 */