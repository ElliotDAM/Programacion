package ies.puerto;

/**
 * Clase dedicada al calculo de un numero mayor y un numero menor en un Array.
 * @author ElliotDAM
 */
public class Ejercicio3 {
    /**
     * Metodo que se utiliza para localizar el numero mayor en el array.
     * @return numeroMayor del array.
     */
    public int numeroMayorArray(){

        int[] array = {20, 40, 70, 30, 10};
        int numeroMayor = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > numeroMayor){
                numeroMayor = array[i];
            }
        }
        return numeroMayor;
    }

    /**
     * Metodo que se utiliza para localizar el numero menor en un array.
     * @return numeroMenor del array localizado.
     */
    public int numeroMenorArray(){

        int[] array = {20, 40, 70, 30, 10};
        int numeroMenor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < numeroMenor){
                numeroMenor = array[i];
            }
        }
        return numeroMenor;
    }

    /**
     * Metodo que se utiliza para mostrar el numero mayor y numero menor del array anteriormente calculado.
     */
    public void mostrarMayorMenor(){

        int numeroMayor = numeroMayorArray();
        int numeroMenor = numeroMenorArray();
        System.out.println("El numero mayor es: " + numeroMayor + ".");
        System.out.println("El numero menor es: " + numeroMenor + ".");
    }

}