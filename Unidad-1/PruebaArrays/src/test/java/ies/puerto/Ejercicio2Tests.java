package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Tests{

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void testPromedioArrayOk(){

        float promedioOk = 3.5f;
        float resultado = ejercicio2.promedioArray();
        Assertions.assertEquals(promedioOk, resultado, "Este resultado es el correcto.");
    }

    @Test
    public void testPromedioArrayError(){

        float promedioError = 2.5f;
        float resultado = ejercicio2.promedioArray();
        Assertions.assertNotEquals(promedioError, resultado, "Este resultado no es correcto.");
    }
    
}