package main.java;

import java.util.Scanner;
/**
 * author ElliotDAM
 */
public class Ejercicio10 {
    /**
     * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suma de numeros pares");
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();
        int sumador = 2;
        int suma = 0;
        
        do{
            
            if (sumador % 2 == 0){
                suma = sumador + suma; 
            }
            sumador ++;
        }while(numero > sumador);
        System.out.println("La suma es: "+ suma);

       /**
        *  for (int i = 2; i < 60; i++) {
            if (i % 2 == 0){
                int suma = i + suma;
            } 
            */
            
        }
        
    }
}
