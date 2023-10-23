
package ies.puerto;
/**
 * Clase con el objetivo de convertir grados Farenheit a Celsius
 * @author ElliotDAM
 */
public class Ejercicio6 {
    /**
     * Función que determina la conversión de grados Farenheit a grados Celsius
     * @param farenheit numero de grados Farenheit
     * @param celsius fórmula para hacer la conversión
     * @return celsius resultado de la conversión
     */
    public int conversorFarenheitCelsius(double farenheit){
        double celsius = ((5 / 9)*(farenheit - 32));
        return celsius;
    }
}