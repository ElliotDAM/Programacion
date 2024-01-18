package ies.puerto.Bloque3;
/**
 * Escribe un programa que declare una variable double y otra int, luego realiza una conversión explícita de double a int y muestre el resultado.
 * @author ElliotDAM
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        double numeroDouble = 16.75;
        int numeroInt = (int) numeroDouble;
        System.out.println("La conversion de double a int termina en: "+numeroInt);
    }
}
