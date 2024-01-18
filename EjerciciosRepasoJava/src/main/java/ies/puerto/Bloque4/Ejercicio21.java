package ies.puerto.Bloque4;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos números enteros ingresados por el usuario y muestre cuál es mayor o si son iguales.
 * @author ElliotDAM
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        int numero2 = sc.nextInt();

        if(numero1 < numero2){
            System.out.println(numero2 +" es mayor que "+numero1);
        }else{
            System.out.println(numero1+" es mayor que "+numero2);
        }

        if(numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }
    }
}
