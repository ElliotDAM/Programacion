package ies.puerto;

/**
 * Clase dedicada a la suma de los elementos de un array
 * @author ElliotDAM
 */
public class Ejercicio1 {

    public static void main(String[] args) {

    }

    /**
     * Metodo para calcular la suma de los elementos de un array.
     * @return suma de los elementos.
     */
    public int calcularSuma(){
        int suma = 0;
        int[] array = {10, 20, 30, 40, 50};

        for (int i = 0; i < array.length ; i++) {
            suma += array[i];
        }
        return suma;
    }

    /**
     * Metodo para mostrar el resultado de la suma de los elementos del array.
     * @return resultado de la suma.
     */
    public int mostrarResultado(){

        int resultado = calcularSuma(suma);

        return resultado;


    }
}