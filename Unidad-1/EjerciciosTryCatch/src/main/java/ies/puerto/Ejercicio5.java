package main.java.ies.puerto;

import java.util.Scanner;
/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc") y trata de evaluarla.
 * Maneja la excepcion ArithmeticException u otra excepcion adecuada.
 * @author ElliotDAM
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        matematicas();
    }

    public static matematicas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una expresion algebraica:");
        String expresion = sc.nextLine();

        try {
           
        } catch (ArithmeticException arithmeticException) {
            System.out.println("No se ha podido evaluar la operacion.");
        }
    }

    public void evaluarExpresion(){
        
    }
}
