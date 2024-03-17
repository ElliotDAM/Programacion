package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class PersonajeTest {

        String nombre = "nombre";
        String alias = "alias";
        String genero = "genero";
        List<String> poderes;

    Personaje personaje;

    @BeforeEach
    public void beforeEach() {
        personaje = new Personaje(nombre, alias, genero, poderes);
    }

    @Test
    public void createPersonajeTest() {
        Assertions.assertNotNull(personaje, "El objeto no puede ser nulo");
    }

    @Test
    public void toStringPersonajeTest() {
        Assertions.assertTrue(personaje.toString().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(genero),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(String.valueOf(poderes)),
                "El resultado no es el esperado");
    }


    @Test
    public void toCsvPersonajeTest() {
        Assertions.assertTrue(personaje.toCsv().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(genero),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(String.valueOf(poderes)),
                "El resultado no es el esperado");
    }

    @Test
    public void equalsPersonajeTest() {
        Personaje personajeBuscar = new Personaje(nombre);
        Assertions.assertEquals(personajeBuscar, personaje,
                "las personajes deben de ser iguales");
    }

    @Test
    public void personajeToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(personaje, new File("src/main/resources/personaje.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void xmlToPersonajeTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/personaje.xml");
            Personaje personaje = serializer.read(Personaje.class, file);
            Assertions.assertEquals(nombre, personaje.getNombre(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(alias, personaje.getAlias(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(genero, personaje.getGenero(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(poderes, personaje.getPoderes(),
                    "No se ha obtenido el valor esperado");

        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }



}
