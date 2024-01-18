package ies.puerto.Bloque4;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un numero decimal ingresado por el usuario es positivo, negativo o cero.
 * @author ElliotDAM
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        if(numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }

        if(numero == 0){
            System.out.println("Su numero es cero");
        }
    }
}
