package ies.puerto;
/**
 * Clase dedicada a la ordenacion de un array en forma ascendente.
 * @author ElliotDAM
 */
public class Ejercicio7{

    public void ordenAscendente(){

        int[] array = {7,3,25,4,18};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j]=array[j+1];
                    array[j+1]= aux;
                }
            }
        }
        
    }
}