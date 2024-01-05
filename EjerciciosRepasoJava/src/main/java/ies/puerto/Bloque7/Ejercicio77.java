package main.java.ies.puerto.Bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar cinco notas y calcule el promedio utilizando un bucle for.
 * @author ElliotDAM
 */
public class Ejercicio77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        double promedio;
        int sumaNotas = 0;

        System.out.println("Ingresa cinco notas para calcular su promedio");
        for (int i = 1; i <= 5; i++) {
            nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;
        }
        
        promedio = sumaNotas / 5.0;

        System.out.println("El promedio de las notas ingresadas es: "+promedio);
    }
}
