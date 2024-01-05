package main.java.ies.puerto.Bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar números con un bucle while y calcule la suma de esos números. Termina el bucle cuando la suma alcance o supere 100.
 * @author ElliotDAM
 */
public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        System.out.println("Ingresa numeros hasta que su suma sea 100");
        while(suma < 100){
        int numero = sc.nextInt();
        suma = suma + numero;
        }

        System.out.println("La suma final es: "+suma);
        
    }
}
