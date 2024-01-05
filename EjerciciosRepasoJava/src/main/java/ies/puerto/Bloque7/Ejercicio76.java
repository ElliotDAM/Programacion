package main.java.ies.puerto.Bloque7;
import java.util.Scanner;
/**
 * Escribe un programa que solicite al usuario ingresar números positivos utilizando un bucle do-while. El bucle debe continuar hasta que el usuario ingrese un número negativo.
 * @author ElliotDAM
 */
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingresa un numero");
            numero = sc.nextInt();
            
        } while (numero < 0);
    }
}
