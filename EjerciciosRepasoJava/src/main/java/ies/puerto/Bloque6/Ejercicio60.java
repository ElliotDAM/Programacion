package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos cadenas ingresadas por el usuario y determine si son iguales o diferentes.
 * @author ElliotDAM
 */
public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        System.out.println("Ingrese otra cadena");
        String cadena2 = sc.nextLine();

        boolean esIgual = cadena.equals(cadena2);

        if(esIgual){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
    }
}
