package ies.puerto;

import java.util.Scanner;

/**
 * Clase con el objetivo de realizar diferentes funciones con 5 numeros dados.
 * @author ElliotDAM
 */
public class Ejercicio3 {

    /**
     *Función que define las variables a ejecutar en esta clase.
     */
    public int numero1, numero2, numero3, numero4, numero5;

    /**
     * Funcion que pide los cinco numeros con los que vamos a trabajar.
     */
    public void pedirNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Dame el segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("Dame el tercer numero");
        int numero3 = sc.nextInt();
        System.out.println("Dame el cuarto numero");
        int numero4 = sc.nextInt();
        System.out.println("Dame el quinto numero");
        int numero5 = sc.nextInt();
    }

    /**
     * Funcion que muestra los valores dados por el usuario.
     */

    public void mostrarNumeros(){
        System.out.println("Los numeros ingresados son: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4 + ", " + numero5 + ".");
    }
    /**
     * Funcion que suma los valores dados por el usuario
     */

    public int sumaNumerosDados(){
        int suma = numero1 + numero2 + numero3 + numero4 + numero5;
        return suma;
    }

    /**
     * Funcion que ordena y muestra los valores en orden creciente.
     * 
     */
    public void ordenCreciente(){
        
        int minimo = numero1;
        int segundoMinimo = numero2;
       

        if (segundoMinimo < minimo){
            int aux = minimo;
            minimo = segundoMinimo;
            segundoMinimo = aux;
        }

        if (numero3 < minimo){
            segundoMinimo = minimo;
            minimo = numero3;
        }else if (numero3 < segundoMinimo){
            segundoMinimo = numero3;
        }

        if (numero4 < minimo){
            segundoMinimo = minimo;
            minimo = numero4;
        }

        if (numero5 < minimo){
            segundoMinimo = minimo;
            minimo = numero5;
        } else if (numero5 < segundoMinimo){
            segundoMinimo = numero5;
        }

        System.out.println("Los numeros en orden creciente: " + minimo + ", " + segundoMinimo);

        for (int i = 1; i <= 5; i++) {
            if (i != minimo && i != segundoMinimo){
                System.out.println(", " + i);
            }
            
        }

        System.out.println();
    }

    /**
     * Funcion que ordena y muestra los valores en orden decreciente.
     */

    public void ordenDecreciente(){
        int maximo = numero1;
        int segundoMaximo = numero2;

        if (segundoMaximo > maximo){
            int aux = maximo;
            maximo = segundoMaximo;
            segundoMaximo = aux;
        }

        if (numero3 > maximo){
            segundoMaximo = maximo;
            maximo = numero3;
        } else if (numero3 > segundoMaximo){
            segundoMaximo = numero3;
        }

        if (numero4 > maximo){
            segundoMaximo = maximo;
            maximo = numero4;
        } else if (numero4 > segundoMaximo){
            segundoMaximo = numero4;
        }

        if (numero5 > maximo){
            segundoMaximo = maximo;
            maximo = numero5;
        } else if (numero5 > segundoMaximo){
            segundoMaximo = numero5;
        }

        System.out.println("Los numeros en orden decreciente: " + maximo + ", " + segundoMaximo);

        for (int i = 1; i < 5; i++) {
            if (i != maximo && i != segundoMaximo){
                System.out.println(", " + i);
            }
        }
        System.out.println();
    }
}
