package es.ies.puerto;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.OperacionesBd;
import es.ies.puerto.modelo.imp.Personaje;


public class OperacionesBdTest {
    static OperacionesBd operacionesBd;
    static String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    static Personaje personaje;

    @BeforeAll
    public static void beforeAll() {
        try {
            operacionesBd = new OperacionesBd(urlBd);
            personaje = new Personaje(3, "Bernardo", "masculino");
            operacionesBd.insertarPersonaje(personaje);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @AfterAll
    public static void afterAll() {
        try {
            operacionesBd.eliminarPersonaje(personaje);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPersonajesAllTest() {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(3, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void ObtenerPersonajeTest() {
        Personaje personaje = new Personaje(1, "Ironman", "Masculino");
        try {
            personaje = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertNotNull(personaje, MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getGenero(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarPersonajeTest() {
        try {
            int numeroPersonajes = operacionesBd.obtenerPersonajes().size();
            operacionesBd.insertarPersonaje(personaje);
            Personaje personajeObtenido = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(personajeObtenido);
            int numeroPersonajesFinal = operacionesBd.obtenerPersonajes().size();
            Assertions.assertEquals(personaje, personajeObtenido, MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() {
        int idUpdate = 3;
        String nombreUpdate = "Pepex";
        String generoUpdate = "masculino";

        try {
            operacionesBd.insertarPersonaje(personaje);
            personaje.setId(idUpdate);
            personaje.setNombre(nombreUpdate);
            personaje.setGenero(generoUpdate);
            Personaje personajeEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeEncontrado, MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(), personajeEncontrado.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(), personajeEncontrado.getGenero(), MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(personajeEncontrado);
        } catch (PersonajeException e) {
            Assertions.fail(MESSAGE_ERROR+":"+e.getMessage());
        }
    }
}
