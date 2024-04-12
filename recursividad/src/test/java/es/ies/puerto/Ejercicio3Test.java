package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio;
    List<Integer> resultadoEsperado;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio3();
        resultadoEsperado = new ArrayList<>(Arrays.asList(0,2,4,6,8,10));
    }

    @Test
    public void ejercicio3Test() {
        Assertions.assertEquals(resultadoEsperado, ejercicio.imprimirPares(10), "No se ha obtenido el resultado esperado");
    }
}
