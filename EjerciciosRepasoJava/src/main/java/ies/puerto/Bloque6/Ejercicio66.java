package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Haz un programa que tome una frase y una palabra ingresada por el usuario, luego determine si la palabra está contenida en la frase.
 * @author ElliotDAM
 */
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        System.out.println("Ingrese palabra a buscar en la frase");
        String palabra = sc.nextLine();

        palabraEnLaFrase(palabra, frase);

    }

    public static boolean palabraEnLaFrase(String palabra, String frase){
        if(frase.contains(palabra)){
            return true;    
        }
        return false;
    }
}
