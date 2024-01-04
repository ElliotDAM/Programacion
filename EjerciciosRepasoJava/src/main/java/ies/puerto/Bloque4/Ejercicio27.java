package main.java.ies.puerto.Bloque4;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario un número (puede ser entero o decimal) y determine si es divisible por 5.
 * @author ElliotDAM
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un numero entero");
        int numero = sc.nextInt();

        if(numero % 5 == 0){
            System.out.println("El numero es divisible por 5");
        }else{
            System.out.println("El numero no es divisible por 5.");
        }
    }
}
