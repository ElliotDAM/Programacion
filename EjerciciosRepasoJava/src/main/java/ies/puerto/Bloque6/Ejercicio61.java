package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número entero ingresado por el usuario y lo convierta a una cadena, luego muestre la longitud de esa cadena.
 * @author ElliotDAM
 */
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        String numeroStr = String.valueOf(numero);

        System.out.println(numeroStr.length());


    }
}
