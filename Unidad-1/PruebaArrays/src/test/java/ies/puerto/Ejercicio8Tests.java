package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Tests{
    
    Ejercicio8 ejercicio8 = new Ejercicio8();
    
    @Test
    public void testEliminarDuplicadosOk(){

        //int[] arrayDuplicados = {1,3,4,5,4,6};
        int[] resultadoEsperado = {1,3,4,5,6};

        int[] resultado = ejercicio8.eliminarDuplicados();
        Assertions.assertArrayEquals(resultadoEsperado, resultado, "Se han eliminado los duplicados.");

    }
}