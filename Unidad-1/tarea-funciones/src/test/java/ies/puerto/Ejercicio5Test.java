package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();


    @Test
    public void numeroPrimoTest(int numero, boolean resultadoOk){
        boolean resultado = ejercicio5.numeroPrimo(numero);
        // Assertions.assertTrue(resultado);
        Assertions.assertEquals(resultadoOk, resultado, "Resultado no esperado");
    }
}