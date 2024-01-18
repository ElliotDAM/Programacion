package ies.puerto.Bloque1;

import java.util.Scanner;

/**
 * Crea un programa que solicite su nombre y luego muestre "¡Hola, [nombre]!", 
 * donde [nombre] es el nombre proporcionado por el usuario.
 * @author ElliotDAM
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola, "+nombre);
    }
}
