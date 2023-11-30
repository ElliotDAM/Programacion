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
            float numero1 = sc.nextFloat();
            System.out.println("Ingrese el segundo:");
            float numero2 = sc.nextFloat(); 
            float resultado = division(numero1, numero2);

            System.out.println("El resultado de la division es:"+division);
        } catch (ArithmeticException e) {
            System.out.println("En esta operacion solo se pueden agregar numeros.");    
            throw new InputMismatchException("Ingrese un numero valido.");        
        }
    }    

    public static float division(float numero1, float numero2)throws ArithmeticException{

        if(numero2 == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return numero1 / numero2;

    }
}
