package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    static Ejercicio6 ejercicio6;
    @BeforeAll
    public static void before(){
        ejercicio6 = new Ejercicio6();
    }
    @Test
    public void verificarArmstrongFalse() {
    int numero = 154;

    boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertFalse(resultado, "El número NO debe ser Armstrong");
    }
    @Test
    public void verificarArmstrongOk() {
        int numero = 1;

        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertTrue(resultado, "El número debe ser Armstrong");
    }
    @Test
    public void verificarArmstrongDosOk() {
        int numero = 2;

        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertTrue(resultado, "El número debe ser Armstrong");
    }
}
