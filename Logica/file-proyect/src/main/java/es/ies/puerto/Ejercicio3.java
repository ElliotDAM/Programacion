package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el poligono deseado");
        String poligono = sc.nextLine();
        switch(poligono){
            case "cuadrado":
                System.out.println("Tamaño lados:");
                float lado = sc.nextFloat();

                float areaCuadrado = lado * lado;
                System.out.println("El area del cuadrado es:"+ areaCuadrado);
                break;
            case "triangulo":
                System.out.println("Base:");
                float base = sc.nextFloat();
                System.out.println("Altura");
                float altura = sc.nextFloat();

                float areaTriangulo = (base * altura) / 2;
                System.out.println("El area del triangulo es: "+areaTriangulo);
                break;
            case "rectangulo":
                System.out.println("Largo:");
                float largo = sc.nextFloat();
                System.out.println("Ancho:");
                float ancho = sc.nextFloat();

                float areaRectangulo = largo * ancho;
                System.out.println("El area del rectangulo es: "+areaRectangulo);
                break;
            
        }

    }
   
}
