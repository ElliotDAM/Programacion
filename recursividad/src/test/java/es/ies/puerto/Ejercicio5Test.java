package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    private static final String NO_SE_HA_OBTENIDO_EL_RESULTADO_ESPERADO = "No se ha obtenido el resultado esperado";
    Ejercicio5 ejercicio;
    int resultado = 24;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();

    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(resultado, ejercicio.factorial(4), NO_SE_HA_OBTENIDO_EL_RESULTADO_ESPERADO);
    }
}
