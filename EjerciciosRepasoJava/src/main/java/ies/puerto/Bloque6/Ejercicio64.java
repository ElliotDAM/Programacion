package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número ingresado como cadena y lo convierta a un valor entero, luego multiplícalo por 2 y muestra el resultado.
 * @author ElliotDAM
 */
public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String numeroStr = sc.nextLine();
        int numero = Integer.parseInt(numeroStr);
        int multiplicacion = numero * 2;

        System.out.println("El resultado de multiplicar "+numero+" por dos es: "+multiplicacion);

    }
}
