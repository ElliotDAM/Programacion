package ies.puerto.Bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome el precio de un producto ingresado por el usuario y muestre el precio final con el 7% de IGIC incluido .
 * @author ElliotDAM
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el precio del producto sin IGIC");
    double precioSinIgic = sc.nextDouble();
    double igic = 0.07;
    double precioIgic = precioSinIgic * igic;
    System.out.println("El precio con IGIC es: "+precioIgic);
  }  
}
