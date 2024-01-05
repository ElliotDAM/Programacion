package main.java.ies.puerto.Bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número decimal, lo convierta a una cadena y muestre cuántos dígitos tiene después del punto decimal.
 * @author ElliotDAM
 */
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        double decimal = sc.nextDouble();

        String numeroStr = doubleAString(decimal);
        int numerosDespuesPunto = contarDecimales(numeroStr);

        System.out.println("El numero "+numero+" tiene "+numerosDespuesPunto+" decimales");

    }

    public static String doubleAString(double numero){
        String numeroStr = String.valueOf(numero);
        return numeroStr;
    }

    public static int contarDecimales(String numero){
        int punto = numero.indexOf('.');

        int posicionPunto = numero.length() - 1 - punto;

        return posicionPunto;
    }
}
