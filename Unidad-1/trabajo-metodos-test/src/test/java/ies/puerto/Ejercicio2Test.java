package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void calculoMcdTestOk() {
        int resultado = 0;
        int resultadoCorrecto = 5;
        int numero1 = 10;
        int numero2 = 5;

        resultado = ejercicio2.mcd(numero1, numero2);

        Assertions.assertEquals(resultadoCorrecto, resultado, "No se ha obtenido el resultado esperado");
    }
}
