package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Tests{
    
    Ejercicio3 ejercicio3 = new Ejercicio3();
    
    @Test
    public void testNumeroMayorOk(){

        //int[] array = {20,40,70,30,10};
        //int mayorOk = ejercicio3.numeroMayorArray(array);
        int mayorOk = 70;
        int resultado = ejercicio3.numeroMayorArray();
        Assertions.assertEquals(mayorOk, resultado, "Este numero es el mayor.");

    }

    @Test
    public void testNumeroMayorError(){

        int mayorError = 20;
        int resultado = ejercicio3.numeroMayorArray();
        Assertions.assertNotEquals(mayorError, resultado, "Este numero no es el mayor.");
    }

    @Test
    public void testNumeroMenorOk(){

        //int[] array = {20, 40, 70, 30, 10};
        //int menorOk = ejercicio3.numeroMenorArray();
        int menorOk = 10;
        int resultado = ejercicio3.numeroMenorArray();
        Assertions.assertEquals(menorOk, resultado, "Este numero es el menor.");
        
    }

    @Test
    public void testNumeroMenorError(){

        int menorError = 30;
        int resultado = ejercicio3.numeroMenorArray();
        Assertions.assertNotEquals(menorError, resultado, "Este numero no es el menor.");
    }

}