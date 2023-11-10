package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void maximoTestError(int numero1, int numero2){
        int resultadoOk = 0;
        int resultado = ejercicio4.maximo(numero1, numero2);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void maximoTresTest(int numero1, int numero2, int numero3){
        int maximo1 = ejercicio4.maximo(numero1, numero2);
        int maximoObtenido = ejercicio4.maximo(maximo1, numero3);
        int maximoEsperado = maximoObtenido;

        Assertions.assertEquals(maximoEsperado, maximoObtenido, "Los maximos no coinciden.");

    }
}