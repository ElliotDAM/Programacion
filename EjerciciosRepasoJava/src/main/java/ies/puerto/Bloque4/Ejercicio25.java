package main.java.ies.puerto.Bloque4;
import java.util.Scanner;
/**
 * Desarrolla un programa que tome un carácter ingresado por el usuario y determine si es una vocal o una consonante.
 * @author ElliotDAM
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter = sc.nextLine();

        if(caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u'){
            System.out.println("El caracter es vocal");
        }else{
            System.out.println("El caracter es consonante");
        }
    }
}
