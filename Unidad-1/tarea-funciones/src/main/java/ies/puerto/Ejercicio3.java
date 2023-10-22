package ies.puerto;
/**
 * Clase que tiene como objetivo calcular el área de un cuadrado y un rectángulo
 * @author ElliotDAM
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /**
     * Función que tiene como objetivo calcular el área de un cuadrado
     * @param lado tamaño del lado del cuadrado
     * @return area del cuadrado
     */

    public int areaCuadrado(int lado) {
        int area = lado * lado;

        return area;
    }
/**
 * Función que tiene como obetivo calcular el área de un rectángulo
 * @param ladoA lado corto del rectángulo
 * @param ladoB lado largo del rectángulo
 * @return area del rectángulo
 */
    public int areaRectangulo(int ladoA, int ladoB) {
        int area = ladoA * ladoB;

        return area;
    }
}