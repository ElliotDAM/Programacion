package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza el ejercicio 1 de la tarea.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int valorA, valorB;

        //Bloque 1: Pide por pantalla y asigna los valores.



        //Bloque 2: Verifica si los valores son iguales
        do{
            System.out.println("Determina el valor de la variable A:");
            valorA = sc.nextInt();
            System.out.println("Valor de la variable A: "+valorA);
            System.out.println("Determina el valor de la variable B:");
            valorB = sc.nextInt();
            System.out.println("Valor de la variable B: "+valorB);
            System.out.println("Los números son iguales. Vuelve a ingresar los datos si quieres compararlos.");
        }while(valorA == valorB);
        //Bloque 3: Verifica si A es mayor que B y muestra por pantalla el valor mayor
        if (valorA > valorB){
            System.out.println(valorA+" es mayor que "+valorB);
        }else{
            System.out.println(valorB+" es mayor que "+valorA);
        }
    
    }




}