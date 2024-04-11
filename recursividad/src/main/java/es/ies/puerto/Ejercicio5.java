package es.ies.puerto;
/**
 * Escribe una función recursiva llamada factorial() 
 * para calcular el factorial de un número entero dado.
 */
public class Ejercicio5 {

    public int factorialTradicional(int numero){
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;

        }
        return resultado;
        }

    public int factorial(int numero){
        if(numero == 1){
            return 1;
        }

        return numero * factorial(numero - 1);
    }
 

}
