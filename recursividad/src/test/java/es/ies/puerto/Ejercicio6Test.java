package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio;
    int resultadoEsperado = 125;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio6();
    }

    @Test
    public void ejercicio6Test() {
        Assertions.assertEquals(resultadoEsperado, ejercicio.potenciaRecursiva(5, 3));
    }
}
