package main.java.ies.puerto.Bloque5;
import java.util.Scanner;
/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y determine si tienen la misma longitud.
 * @author ElliotDAM
 */
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera cadena");
        String cadena1 = sc.nextLine();
        System.out.println("Segunda cadena");
        String cadena2 = sc.nextLine();

        if(cadena1.length == cadena2.length){
            System.out.println("Las dos cadenas tienen la misma longitud");
        }
    }
}

