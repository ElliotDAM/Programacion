package org.example;

/**
 * @author ElliotDAM
 */
public class Ejercicio8 {

    /**
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     * @param args
     */
    public static void main(String[] args) {

        int N = 0;
        int cuenta = 0;
        int promedio = 0;
        int acumula = 0;

        while(N != 0){
            cuenta = cuenta + 1;
            acumula = acumula + 1;
        }
        
        promedio = acumula / cuenta;

        System.out.println("El promedio es: "+ promedio);
    }
}