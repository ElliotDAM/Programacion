package ies.puerto;
/**
 * Clase que tiene como objetivo realizar el cálculo del área de un triángulo
 * @author ElliotDAM
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
/**
 * Función que calcula el área de un triángulo
 * @param base del triángulo
 * @param altura del triángulo
 * @return resultado del cálculo del area del triángulo
 */
    public int areaTriangulo(int base, int altura) {
        
        int area = ((base * altura) / 2);

        return area;
    }

}