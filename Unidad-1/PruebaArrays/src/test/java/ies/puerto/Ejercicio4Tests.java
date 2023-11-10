package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Tests{
//Falta arreglar el array en base al problema en el codigo del ejercicio.
    

    @Test
    public void testCalcularNumerosParesOk(){

        int[] arrayEsperado = {30, 60, 0, 0, 0};
        int[] resultado = Ejercicio4.calcularNumerosPares();

        Assertions.assertArrayEquals(arrayEsperado, resultado, "Estos numeros son los pares del array.");
    }

    @Test
    public void testCalcularNumerosParesError(){

        int[] arrayNoEsperado = {15, 45};
        int[] resultado = Ejercicio4.calcularNumerosPares();

        Assertions.assertNotEquals(arrayNoEsperado, resultado, "Estos numeros no son los pares.");
    }
}