package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio1();
    }

    @Test
    public void ejercicio1Test() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        List<Integer> resultado;
        resultado = ejercicio.cuentaDescendente(10);
        Assertions.assertEquals(resultadoEsperado, resultado, "ERROR");
        

    }

    @Test
    public void ejercicio1RecursivoTest() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        List<Integer> resultado;
        resultado = ejercicio.cuentaRegresiva(10);
        Assertions.assertEquals(resultadoEsperado, resultado, "ERROR");
        

    }
}
