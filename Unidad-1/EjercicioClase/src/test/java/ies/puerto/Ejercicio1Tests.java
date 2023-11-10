package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void testBusquedaBinariaOk(){


        int[] array = {1,2,3,4,5};
        
        int posicionEsperada = -1;
        int medioObtenido = ejercicio1.busquedaBinaria(array, posicionEsperada);

        Assertions.assertEquals(medioObtenido, posicionEsperada, "El numero de esa posicion no es el esperado.");
    }

    
}
