package main.java.ies.puerto;

import java.util.Scanner;
/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc") y trata de evaluarla.
 * Maneja la excepcion ArithmeticException u otra excepcion adecuada.
 * @author ElliotDAM
 */
public class Ejercicio5 {
    
    public static void main(String[] args) throws Exception{
        matematicas();
    }

    public static matematicas(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dame una expresion algebraica:");
            int expresion = sc.nextLine();
        } catch (ArithmeticException arithmeticException) {
            throw new Exception("No se ha podido evaluar la operacion.");
        }
    }

   
}
