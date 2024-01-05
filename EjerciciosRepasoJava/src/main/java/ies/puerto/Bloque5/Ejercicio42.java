package main.java.ies.puerto.Bloque5;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.
 * @author ElliotDAM
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero decimal");
        double numero = sc.nextDouble();

        if(numero > 0){
            System.out.println("Su numero es positivo");
        }else if (numero < 0) {
            System.out.println("Su numero es negativo ");
        }else if(numero == 0){
            System.out.println("Su numero es cero");
        }
    }
}
