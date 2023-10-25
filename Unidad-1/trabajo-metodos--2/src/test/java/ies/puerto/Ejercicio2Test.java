package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void numeroPositivoNegativoTestPositivo(){
        boolean resultado = ejercicio2.numeroEsPositivoNegativo(5);
        Assertions.assertTrue(resultado, "El numero debe devolver true. Es positivo.");
    }
    @Test
    public void numeroPositivoNegativoTestNegativo(){
        boolean resultado = ejercicio2.numeroEsPositivoNegativo(-5);
        Assertions.assertFalse(resultado, "El numero debe devolver false. Es negativo.");
    }

    @Test
    public void esParOImparTestPar(){
        boolean resultado = ejercicio2.esParOImpar(8);
        Assertions.assertTrue(resultado, "El numero debe devolver true. Es par.");
    }

    @Test
    public void esParOImparTestImpar(){
        boolean resultado = ejercicio2.esParOImpar(7);
        Assertions.assertFalse(resultado, "El numero debe devolver false. Es impar.");
    }



}
