package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void sumaNumerosDadosTestOk(){
        ejercicio3.numero1 = 10;
        ejercicio3.numero2 = 5;
        ejercicio3.numero3 = 15;
        ejercicio3.numero4 = 22;
        ejercicio3.numero5 = 4;
        int resultado = ejercicio3.sumaNumerosDados();
        Assertions.assertEquals(56,resultado, "Este resultado es correcto");
    }

    @Test
    public void sumaNumerosDadosTestError(){
        ejercicio3.numero1 = 10;
        ejercicio3.numero2 = 5;
        ejercicio3.numero3 = 15;
        ejercicio3.numero4 = 22;
        ejercicio3.numero5 = 4;
        int resultado = ejercicio3.sumaNumerosDados();
        Assertions.assertEquals(0,resultado, "Este resultado no es correcto");
    }

    @Test
    public void ordenCrecienteTest(){
        ejercicio3.numero1 = 10;
        ejercicio3.numero2 = 5;
        ejercicio3.numero3 = 15;
        ejercicio3.numero4 = 22;
        ejercicio3.numero5 = 4;
    }

    @Test
    public void ordenDecrecienteTest(){
        ejercicio3.numero1 = 10;
        ejercicio3.numero2 = 5;
        ejercicio3.numero3 = 15;
        ejercicio3.numero4 = 22;
        ejercicio3.numero5 = 4;
        
    }


}
