package ies.puerto;

/**
 * Clase destinada al calculo del promedio de los datos de un array.
 * @author ElliotDAM
 */
public class Ejercicio2 {

    /**
     * Metodo que calcula el promedio de los numeros de un array.
     * @return promedio de los numeros calculados.
     */
    public float promedioArray(){

        float suma = 0;
        float promedio = 0;
        float[] array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        promedio = suma / array.length;

        return promedio;
    }

    /**
     * Metodo para mostrar el resultado del promedio anteriormente calculado.
     * @return resultado del promedio calculado.
     */
    public float mostrarResultado(){

        float resultado = promedioArray();

       return resultado;
    }
}