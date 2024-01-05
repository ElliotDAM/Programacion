package main.java.ies.puerto.Bloque6;
import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero y un número decimal ingresados por el usuario, los multiplique y muestre el resultado en una cadena junto con un mensaje.
 * @author ElliotDAM
 */
public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int entero = sc.nextInt();
        System.out.println("Ingresa un numero decimal");
        double decimal = sc.nextDouble();

        double multiplicacion = multiplicacionIntDouble(entero, decimal);
        doubleAString(multiplicacion);

        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);

    }
/**
 * Multiplicacion de un numero entero y uno decimal
 * @param numero
 * @param numero1
 * @return resultado de la multiplicacion
 */
    public static double multiplicacionIntDouble(int numero, double numero1){
        double multiplicacion = numero * numero1;

        return multiplicacion;
    }
    /**
     * Conversion de numero decimal a cadena de texto
     * @param numero
     * @return conversion a cadena
     */
    public static String doubleAString(double numero){
        return String.valueOf(numero);
    }
   
}
