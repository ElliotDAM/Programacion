package main.java.ies.puerto.Bloque5;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario y verifique si contiene la letra 'a' y muestra un mensaje adecuado.
 * @author ElliotDAM
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();

        if(cadena.contains("a")){
            System.out.println("La cadena contiene la letra 'a'");
        }else{
            System.out.println("La cadena no contiene la letra 'a'");
        }
    }
}
