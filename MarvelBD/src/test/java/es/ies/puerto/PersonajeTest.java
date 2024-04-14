package es.ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.modelo.imp.Personaje;

public class PersonajeTest {
    Personaje personaje;
    Set<String> poderes;
    
    @BeforeEach
    public void beforeEach() {
        poderes = new HashSet<>();
        poderes.add("Volar");
        poderes.add("Super fuerza");
        personaje = new Personaje(1,"Superman", "Clark Kent", "Masculino", poderes);
    }

    @Test
    public void personajeTestConstructor() {
        Assertions.assertEquals("Superman", personaje.getNombre());
        Assertions.assertEquals("Clark Kent", personaje.getAlias());
        Assertions.assertEquals("Masculino", personaje.getGenero());
        Assertions.assertEquals(2, personaje.getPoderes().size());
    }

    @Test
    public void personajeTestGettersAndSetters() {
        personaje.setNombre("Batman");
        personaje.setAlias("Bruce Wayne");
        personaje.setGenero("Masculino");
        Set<String> nuevosPoderes = new HashSet<>();
        nuevosPoderes.add("Combate mano a mano");
        personaje.setPoderes(nuevosPoderes);

        Assertions.assertEquals("Batman", personaje.getNombre());
        Assertions.assertEquals("Bruce Wayne", personaje.getAlias());
        Assertions.assertEquals("Masculino", personaje.getGenero());
        Assertions.assertEquals(1, personaje.getPoderes().size());
    }


}
