package main.java.ies.puerto.Bloque7;

import java.util.Scanner;

/**
 * Crea un programa que utilice un bucle for para imprimir un triángulo de asteriscos, donde la base del triángulo es ingresada por el usuario.
 * @author ElliotDAM
 */
public class Ejercicio74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base del triangulo");
        int base = sc.nextInt();

        imprimirTriangulo(base);
    }

    public static void imprimirTriangulo(int base){
        for (int i = 1; i <= base ; i++) {
            for (int j = 1; j <= base; j++) {
                System.out.println(" ");
                
            }
            for (int k = 0; k <= 2 * i -1 ; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
