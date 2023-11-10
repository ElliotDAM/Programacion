package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Ejercicio3Tests{

  

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void testDeterminarNotasIfOk(){

        int notaEsperada = 5;
        String calificacionEsperada = "Aprobado";
        String calificacionObtenida = ejercicio3.determinacionNotasIf(notaEsperada);

        Assertions.assertEquals(calificacionEsperada, calificacionObtenida, "Las calificaciones no coinciden.");

    }

    @Test
    public void testDeterminacionNotasSwitchOk(){

        int nota = 5;
        String calificacionEsperada = "Aprobado";
        String calificacionObtenida = ejercicio3.determinacionNotasIf(nota);

        Assertions.assertEquals(calificacionEsperada, calificacionObtenida, "Las calificaciones no coinciden.");
    }
}