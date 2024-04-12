package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea una función recursiva llamada fibonacci() 
 * para calcular el término N de la serie de Fibonacci.
 */
public class Ejercicio4 {

    public List<Integer> fibonacci(int limite){
        List<Integer> serieFibonacci = new ArrayList<>();
        int numero1 = 0;
        int numero2 = 1;

        serieFibonacci.add(numero1);
        if(limite >= numero2){
            int aux = numero1 + numero2;
            numero1 = numero2;
            numero2 = aux;
        }

        return serieFibonacci;
    }

    public int fibonacciRecursivo(int numero){
        //List<Integer> secuencia = new ArrayList<>();
        int resultado = 0;
        if(numero <= 1){
            return numero;
        }
        resultado = fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
        return resultado;
    }

}
