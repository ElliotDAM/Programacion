package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Ejercicio2Tests{

    @Test
    public void testOrdenacionBurbujaArrayOk(){

        Ejercicio2 ejercicio2 = new Ejercicio2();

        int[] array = {1,4,2,6,8};
        int[] arrayEsperado = {1,2,4,6,8};
        int[] arrayObtenido = ejercicio2.ordenacionBurbujaArray(array);

        Assertions.assertArrayEquals(arrayEsperado, arrayObtenido, "Los arrays no coinciden.");
        
    }

    @Test
    public void testOrdenacionBurbujaArrayError(){

        Ejercicio2 ejercicio2 = new Ejercicio2();

        int[] array = {1,4,2,6,8};
        int[] arrayEsperado = {1,2,4,8,6};
        int[] arrayObtenido = ejercicio2.ordenacionBurbujaArray(array);

        Assertions.assertNotEquals(arrayEsperado, arrayObtenido, "Los arrays siguen coincidiendo.");
        
    }
    
}