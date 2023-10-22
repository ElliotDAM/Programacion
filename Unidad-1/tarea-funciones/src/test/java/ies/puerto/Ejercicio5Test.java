package ies.puerto;

import java.beans.Transient;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5;
    @BeforeEach
    public void before(){
        ejercicio5 = new Ejercicio5();
    }

    @Test
    public void numeroPrimoTest(){
        int numero = 5;
        boolean resultado = ejercicio5.numeroPrimo(numero);

        Assertions.assertTrue(resultado);
    }
}