package ies.puerto;
/**
 * Clase con el objetivo de indicar si el numero que se pasa es positivo o negativo, y si es par o impar.
 * @author ElliotDAM
 */
public class Ejercicio2 {
/**
 * Funcion que determina si el numero introducido es positivo o negativo.
 * @param numero valor que introduce el usuario para realizar la comprobacion.
 * @return esPositivo valor booleano que determina si el numero es positivo o negativo.
 */
public boolean numeroEsPositivoNegativo(int numero){
    
    boolean esPositivo = true;
    if (numero <= 0){
        esPositivo = false;
    }
    return esPositivo;
}
/**
 * Funcion que determina si el numero introducido es par o impar.
 * @param numero valor que introduce el usuario para realizar la comprobacion.
 * @return esPar valor booleano que determina si el numero es par o impar.
 */
public boolean esParOImpar(int numero){
    boolean esPar = false;
    if (numero % 2 == 0){
        esPar = true;
    }
    return esPar;
    
}
}
