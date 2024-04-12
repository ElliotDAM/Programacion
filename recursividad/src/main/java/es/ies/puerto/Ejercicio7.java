package es.ies.puerto;

/**
 * Desarrolla una función recursiva llamada conteoRegresivo() 
 * que imprima un mensaje de conteo regresivo desde un número dado hasta 1.
 */
public class Ejercicio7 {
    public void conteoRegresivoRecursivo(int numero){
        if(numero <= 1){
            return;
        }
        System.out.println(numero);
        conteoRegresivoRecursivo(numero - 1);
    }
}
