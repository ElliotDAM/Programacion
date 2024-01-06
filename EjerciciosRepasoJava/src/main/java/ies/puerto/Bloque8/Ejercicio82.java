package main.java.ies.puerto.Bloque8;

import java.util.Scanner;

/**
 * Desarrolla un programa que ordene un array de enteros en orden ascendente y luego lo muestre. Solicita el tamaño del array, e introduce los valores.
 * @author ElliotDAM
 */
public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique cuantos numeros se van a ingresar");
        int tamanio = sc.nextInt();

        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el "+ (i+1) +" numero");
            array[i] = sc.nextInt();
        }

        ordenarArray(array);

        System.out.println("Array ordenado");
        for (int num : array){
            System.out.println(num + " ");
        }
    }

    public static void ordenarArray(int[] array){
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
