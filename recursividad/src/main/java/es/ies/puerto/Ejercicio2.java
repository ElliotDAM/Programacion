package es.ies.puerto;
/**
 * Implementa una función recursiva llamada sumaNaturales() 
 * para calcular la suma de los primeros N números naturales.
 */
public class Ejercicio2 {

    public int sumaNumerosTradicional(int numero){
        int resultado = 0;
        for (int i = numero; i >= 1; i--) {
            resultado += numero;            
        }
        return resultado;
    }

    public int sumaNaturalesRecursiva(int numero){
        if(numero == 1){
            return 1;
        }

        return numero + sumaNaturalesRecursiva(numero - 1);
    }
}
