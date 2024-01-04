package main.java.ies.puerto.Bloque2;

import java.util.Scanner;

/**
 * Crea un programa que tome el radio de un círculo ingresado por el usuario y muestre su área.
 * @author ElliotDAM
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de area de circulo");
        System.out.println("Ingrese el radio del circulo");
        double radio = sc.nextDouble();
        double areaCirculo = MathPI*(radio*radio);
    }
}
