package main.java.ies.puerto;
import java.util.Scanner;
/**
 * Escribe un programa que solicite al usuario dos numeros e imprima el resultado de la division.
 * Asegurate de manejar la excepcion ArithmeticException si el segundo numero ingresado es 0.
 * @author ElliotDAM
 */
public class Ejercicio1 {
   /**
 * @param args
 * @throws Exception
 */
public static void main(String[] args) throws Exception{
        int numero1 = solicitarNumero();
        int numero2 = solicitarNumero();
        int resultado = division(numero1, numero2);
        System.out.println("Resultado de la division:"+resultado);
   }
   /**
    * Funcion que pide por teclado un numero
    * @return numero obtenido
    */
   public static int solicitarNumero(){
    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("Introduzca un numero:");
    numero = sc.nextInt();
    return numero;
   }
/**
 * Funcion que realiza la division de dos numeros
 * @param dividendo de la division
 * @param divisor de la division
 * @return resultado de la division
 */
   public static int division(int dividendo, int divisor) throws Exception{
        int resultado = 0;
        
        try{
            resultado = dividendo / divisor;
        }catch(ArithmeticException arithmeticException){
            String mensajeError = "Se intenta realizar una division por 0";
            throw new Exception(mensajeError);
        }
        

        return resultado;
   }
}
