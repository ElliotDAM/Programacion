package main.java.ies.puerto.Bloque5;
import java.util.Scanner;
/**
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura. 
 * Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 * @author ElliotDAM
 */
public class Ejercicio46 {
    static double valorMaximo = 29.5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una temperatura");
        double temperatura = sc.nextDouble();
        if(temperatura > valorMaximo){
            System.out.println("Esta temperatura no esta dentro del rango permitido.");
        }else{
            System.out.println("Esta temperatura esta dentro del rango permitido.");
        }
    }
    
}

