package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio;
    int resultado = 55;
    

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio4();
    }

    @Test
    public void ejercicio4Test() {
        Assertions.assertEquals(resultado, ejercicio.fibonacciRecursivo(10));
    }
}
