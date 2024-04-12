package es.ies.puerto;
/**
 * Implementa una función recursiva llamada potencia() 
 * para calcular la potencia de un número base elevado a un exponente dado.
 */
public class Ejercicio6 {

    public int potencia(int numero, int exponente){
        int potencia = numero;
        for (int i = 1; i <= exponente; i++) {
            potencia *= numero;
        }
        return potencia;
    }

    public int potenciaRecursiva(int numero, int potencia){
        int resultado = 1;
        if(potencia == 0){
            return 1;
        }
        resultado = numero * potenciaRecursiva(numero, potencia - 1);
        return resultado;
    }
}
