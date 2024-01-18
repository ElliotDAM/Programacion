package ies.puerto.Bloque2;

import java.util.Scanner;

/**
 * Escribe un programa que solicite la edad del usuario y luego muestre si es mayor de edad o no.
 * @author ElliotDAM
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comprobante mayor de edad");
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }
}
