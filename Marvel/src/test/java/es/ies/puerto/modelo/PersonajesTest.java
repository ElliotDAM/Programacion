package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.modelo.imp.PersonajeList;

import java.io.File;
import java.util.List;

public class PersonajesTest {
    String nombre = "nombre";
    String alias = "alias";
    String genero = "genero";
    List<String> poderes;

    Personaje personaje;
    PersonajeList personajeList;

    @BeforeEach
    public void beforeEach() {
        personajeList =new PersonajeList();
        personaje = new Personaje(nombre, alias, genero, poderes);
    }

    @Test
    public void personasToXml() {

        Persister serializer = new Persister();
        try {
            serializer.write(personaje, new File("src/main/resources/persona.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void xmlToPersonasTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/personas.xml");
            PersonajeList personas = serializer.read(PersonajeList.class, file);
            Assertions.assertNotNull(personas,
                    "Se ha obtenido un valor nulo");
            Assertions.assertTrue(!personas.getPersonajes().isEmpty(),
                    "No ha obtenido una lista vacia");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

}
