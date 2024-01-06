package main.java.ies.puerto.Bloque8;
import java.util.Scanner;
import java.lang.reflect.Array;

/**
 * Escribe un programa que sume todos los elementos de un array de enteros y muestre el resultado. Solicita el tamaño del array, e introduce los valores, para ejecutar la suma.
 * @author ElliotDAM
 */
public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio = 0;
        System.out.println("Indique cuantos numeros se van a ingresar");
        tamanio = sc.nextInt();

        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el "+ (i+1) +" numero");
            array[i] = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }

        System.out.println("La suma de todos los numeros es: "+suma);
    }
}
