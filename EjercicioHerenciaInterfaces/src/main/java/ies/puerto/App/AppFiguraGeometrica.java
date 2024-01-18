package main.java.ies.puerto.App;

import main.java.ies.puerto.impl.Rectangulo;
import main.java.ies.puerto.interfaz.IFormaGeometrica;

public class AppFiguraGeometrica {
    static IFormaGeometrica circulo;
    static IFormaGeometrica cuadrado;
    static IFormaGeometrica rectangulo;

    public static void main(String[] args) {
        cuadrado = new Cuadrado(5f, 5f);
        circulo = new Circulo(5f);
        rectangulo = new Rectangulo(5f, 5f);

        System.out.println("Area circulo: "+cuadrado.calcularArea());
        System.out.println("Area cuadrado: "+circulo.calcularArea());
        System.out.println("Area rectangulo: "+rectangulo.calcularArea());
    }
}
