package es.ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.modelo.imp.Poder;

public class PersonajeTest {
    Personaje personaje;
    Set<Poder> poderes;
    
    @BeforeEach
    public void beforeEach() {
        personaje = new Personaje(1,"Superman", "Masculino");
    }

    @Test
    public void personajeTestConstructor() {
        Assertions.assertEquals("Superman", personaje.getNombre());
        Assertions.assertEquals("Masculino", personaje.getGenero());
    }

    @Test
    public void personajeTestGettersAndSetters() {
        personaje.setNombre("Batman");
        personaje.setGenero("Masculino");


        Assertions.assertEquals("Batman", personaje.getNombre());
        Assertions.assertEquals("Masculino", personaje.getGenero());
    }


}
