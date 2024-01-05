package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Escribe un programa que tome tu nombre y apellido ingresados por separado y muestre tu nombre completo en una sola línea.
 * @author ElliotDAM
 */
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();

        System.out.println(nombre + " "+apellido);
    }
}
