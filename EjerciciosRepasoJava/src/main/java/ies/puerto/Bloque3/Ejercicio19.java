package ies.puerto.Bloque3;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y muestre la concatenación de ambas, así como su longitud.
 * @author ElliotDAM
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una cadena");
        String cadena1 = sc.nextLine();
        System.out.println("Dame otra cadena");
        String cadena2 = sc.nextLine();
        int longitudCadena1 = cadena1.length();
        int longitudCadena2 = cadena2.length();

        int sumaCadenas = longitudCadena1 + longitudCadena2;

        System.out.println(cadena1 + " "+cadena2+". Longitud caracteres: "+sumaCadenas);

    }
}
