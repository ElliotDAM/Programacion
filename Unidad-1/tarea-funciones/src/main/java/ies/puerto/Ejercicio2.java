package ies.puerto;
/**
 * Clase que tiene como objetivo realizar el cálculo del área de un círculo
 * @author ElliotDAM
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
    }
/**
 * Función que calcula el área de un círculo
 * @param radio del círculo a calcular
 * @return area del círculo calculada
 */
    public double areaCirculo(int radio) {
        
        double area = ((radio * radio)* Math.PI);

        return area;
    }
}