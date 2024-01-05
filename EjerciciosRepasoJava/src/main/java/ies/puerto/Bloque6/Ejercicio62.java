package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros ingresados por el usuario, realice la suma y muestre el resultado.
 * @author ElliotDAM
 */
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        System.out.println("El resultado de la suma de los dos numeros es: "+suma);
    }
}
