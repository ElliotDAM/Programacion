package main.java.ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos numeros y realice la division.
 * Maneja la excepcion InputMisMatchException si el usuario ingresa algo que no es un numero.
 * @author ElliotDAM
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {

            System.out.println("Division de dos numeros.");
            System.out.println("Ingrese el primero:");
            double numero1 = sc.nextDouble();
            System.out.println("Ingrese el segundo:");
            double numero2 = sc.nextDouble(); 
            double resultado = division(numero1, numero2);

            System.out.println("El resultado de la division es:"+division);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("En esta operacion solo se pueden agregar numeros.");            
        }
    }    

    public static int division(double numero1, double numero2){

        return numero1 / numero2;

    }
}
