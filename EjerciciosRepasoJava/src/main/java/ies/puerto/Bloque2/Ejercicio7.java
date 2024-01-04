package main.java.ies.puerto.Bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que solicite al usuario una cantidad en euros y muestre su equivalente en dólares solicitando el valor cambio.
 * @author ElliotDAM
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cambio de euro a dolar");
        System.out.println("Dame una cantidad en euros:");
        double euros = sc.nextDouble();
        double diferencia = 1.09;
        double cambioDolares = euros * diferencia;
        System.out.println("El cambio en dolar de "+euros+" es: "+cambioDolares);
    }
}
