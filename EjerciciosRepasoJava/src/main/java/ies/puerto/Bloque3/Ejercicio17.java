package ies.puerto.Bloque3;
import java.util.Scanner;
/**
 * Crea un programa que tome un número entero y un número decimal ingresados por el usuario y muestre su suma, considerando conversiones necesarias.
 * @author ElliotDAM
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int entero = sc.nextInt();
        System.out.println("Dame un numero decimal");
        double decimal = sc.nextDouble();
        double intToDouble = (double) entero;
        double suma = intToDouble + decimal;
        System.out.println("La suma entre "+entero+" y "+decimal+" es: "+suma);
    }
}
