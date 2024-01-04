package main.java.ies.puerto.Bloque4;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.
 * @author ElliotDAM
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su edad");
        int edad = sc.nextInt();

        if(edad < 18){
            System.out.println("Menor de edad");
        }else if(edad > 18 && edad < 66){
            System.out.println("Mayor de edad. Entre 18 y 65 años.");
        }else if(edad < 65){
            System.out.println("Mayor de 65 años");
        }
    }
}
