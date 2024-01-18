package ies.puerto.Bloque5;

import java.util.Scanner;

/**
 * Escribe un programa que determine si una variable booleana ingresada por el usuario es verdadera o falsa y muestre un mensaje correspondiente.
 * @author ElliotDAM
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor booleano");
        boolean valorBooleano = sc.nextBoolean();

        if(valorBooleano){
            System.out.println("El valor es verdadero");
        }else{
            System.out.println("El valor es falso");
        }
    }
}
