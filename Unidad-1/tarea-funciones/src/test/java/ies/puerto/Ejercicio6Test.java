package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();


    @Test
    public void conversionFarenheitCeliusTest(double farenheit){
        double resultadoOk = 0;
        double celsius = ejercicio6.conversorFarenheitCelsius(farenheit);

        Assertions.assertEquals(resultadoOk, celsius, "No es el resultado que se esperaba");

    }
}