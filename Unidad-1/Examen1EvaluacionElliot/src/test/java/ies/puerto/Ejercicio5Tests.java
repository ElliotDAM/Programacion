package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Tests {

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void switchTestOk(){

        int numero = 3;
        String mesEsperado = "Marzo";
        String mesObtenido = ejercicio5.mesSwitch(numero);


        Assertions.assertEquals(mesEsperado,mesObtenido, "No es el mes esperado.");
    }

   @Test
    public void ifElseTestOk(){

       int numero = 3;
       String mesEsperado = "Marzo";
       String mesObtenido = ejercicio5.mesIfElse(numero);


       Assertions.assertEquals(mesEsperado,mesObtenido, "No es el mes esperado.");

    }
}
