package main.java.ies.puerto;

import java.util.Scanner;
/**
 * Crea un programa que solicite al usuario ingresar un número como texto y luego intente convertirlo a un entero. 
 * Maneja la excepción NumberFormatException si el usuario ingresa algo que no es un número.
 * @author ElliotDAM
 */
public class Ejercicio2 {

    public static void main(String[] args) throws Exception{
        String strNumero = solicitarNumero();
        int numero = transformarStrInt(strNumero);

        System.out.println("Valor del numero transformado:"+numero);
    }


    public static String solicitarNumero(){
    Scanner sc = new Scanner(System.in);
    String numero;
    System.out.println("Introduzca un numero:");
    numero = sc.nextLine();
    return numero;
   }

   public static int transformarStrInt(String strNumero) throws Exception{
        int resultado = 0;
        try{
            resultado = Integer.parseInt(strNumero);
        }catch (NumberFormatException e){
            throw new Exception("El valor introduciro: "+strNumero+" no es un numero.");
            
        }
        

        return resultado;
   }
}
