package main.java.ies.puerto.Bloque2;

import java.util.Scanner;
/**
 * Escribe un programa que pida al usuario dos numeros y luego muestre los dos numeros y su suma.
 * @author ElliotDAM
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de suma");
        System.out.println("Dame el primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Dame el segundo numero");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println("El resultado de "+numero1 +" + "+numero2 +"es: "+suma);
    }
}
