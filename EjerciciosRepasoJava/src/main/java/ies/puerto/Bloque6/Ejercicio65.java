package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero ingresado por el usuario, lo convierta a un valor double y muestre la raíz cuadrada de ese número.
 * @author ElliotDAM
 */
public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        double numeroDouble = (double) numero;

        double raizCuadrada = Math.sqrt(numeroDouble);
        System.out.println("La raiz cuadrada de "+numero+" es: "+raizCuadrada);
    }
}
