package main.java.ies.puerto.Bloque3;
/**
 * Haz un programa que utilice una constante para representar el valor de PI (3.14159265) y calcule el área de un círculo.
 * @author ElliotDAM
 */
public class Ejercicio16 {
    static double PI = 3.14159265;
    public static void main(String[] args) {
        double radio = 5.4;
        double areaCirculo = PI * (radio * radio);
        System.out.println("El area del circulo es: "+areaCirculo);
    }
}
