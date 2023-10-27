package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSueldoHorasOkTest(){
        float resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(100,resultado, "Se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularSueldoHorasErrorTest(){
        float resultado = ejercicio1.calcularSueldoHoras(0);
        Assertions.assertEquals(10, resultado, "No está permitido pagar por 0 horas.");
    }

    @Test
    public void calcularSueldoHorasNegativasTest(){
        float resultado = ejercicio1.calcularSueldoHoras(-10);
        Assertions.assertEquals(0, resultado, "No se pueden introducir horas negativas.");
    }

    @Test
    public void calcularSueldoHoras205Test(){
        float resultado = ejercicio1.calcularSueldoHoras(20.5f);
        Assertions.assertEquals(205, resultado, "No se ha obtenido el resultado esperado");
    }
}
