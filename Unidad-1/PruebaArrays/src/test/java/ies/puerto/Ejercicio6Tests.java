package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Tests{

    Ejercicio6 ejercicio6 = new Ejercicio6();


    @Test
    public void testMatrizTranspuestaOk() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        
        int[][] resultadoEsperado = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] resultado = ejercicio6.matrizTranspuesta();
        Assertions.assertArrayEquals(resultadoEsperado, resultado, "Es la matriz que se esperaba.");
    }

    @Test
    public void testMatrizTranspuestaError() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        
        int[][] resultadoNoEsperado = {{1, 2, 7}, {4, 5, 8}, {3, 6, 9}};
        int[][] resultado = ejercicio6.matrizTranspuesta();
        Assertions.assertArrayEquals(resultadoNoEsperado, resultado, "No es la matriz que se esperaba.");
    }
}