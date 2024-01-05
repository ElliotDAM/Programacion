package main.java.ies.puerto.Bloque7;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que simule un juego de adivinanza. Elige un número aleatorio entre 1 y 10 y pide al usuario que adivine. Utiliza un bucle do-while para continuar el juego hasta que el usuario adivine el número.
 * @author ElliotDAM
 */
public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Adivina el numero");
        int numeroRandom = random.nextInt(10) + 1;
        do {
            System.out.println("Ingresa el numero que crees que es");
            int numero = sc.nextInt();
            if(numeroRandom != numero){
                System.out.println("Has fallado. Intentalo de nuevo.");
            }else{
                System.out.println("Felicidades. Has acertado el numero.");
            }
            
        } while (numeroRandom != numero);
    }
}
