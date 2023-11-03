package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Tests {

    Ejercicio7 ejercicio7 = new Ejercicio7();
    @Test
    public void testOrdenAscendenteOk(){

        int[] resultadoEsperado = {3,4,7,18,25};
        int[] resultado = ejercicio7.ordenAscendente();
        Assertions.assertArrayEquals(resultadoEsperado, resultado, "Este resultado es el esperado.");
    }
/* 
    @Test
    public void testOrdenAscendenteError(){

        int[] resultadoNoEsperado = {3,18,7,4,25};
        int[] resultado = ejercicio7.ordenAscendente();
        Assertions.assertNotEquals(resultadoNoEsperado, resultado, "Este resultado no es el esperado.");
    }*/
}