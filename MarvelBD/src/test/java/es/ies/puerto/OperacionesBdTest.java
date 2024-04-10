package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.OperacionesBd;
import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.modelo.imp.PersonajeList;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personaje;

    @BeforeEach
    public void beforeEach(){
        
        try {
            List<String> poderes = new ArrayList<>();
            poderes.add("lanzar");
            poderes.add("puñetazo");
            personaje = new Personaje("Bernardo", "berni", "masculino", poderes);
            operacionesBd = new OperacionesBd(urlBd);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPersonajesAllTest() {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
        
    }

    @Test
    public void ObtenerPersonajeTest() {
        Personaje personaje = new Personaje("Ironman");
        try {
            personaje = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertNotNull(personaje, MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getGenero(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getPoderes(), MESSAGE_ERROR);
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
        String nombreUpdate = "Pepe";
        String aliasUpdate = "Joseluis";
        String generoUpdate = "masculino";
        List<String> poderes = new ArrayList<>();
        poderes.add("botar");
        poderes.add("tirar");

        try {
            operacionesBd.insertarPersonaje(personaje);
            personaje.setNombre(nombreUpdate);
            personaje.setAlias(aliasUpdate);
            personaje.setGenero(generoUpdate);
            personaje.setPoderes(poderes);
            Personaje personajeEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeEncontrado, MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(), personajeEncontrado.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getAlias(), personajeEncontrado.getAlias(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(), personajeEncontrado.getGenero(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getPoderes(), personajeEncontrado.getPoderes(), MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(personajeEncontrado);
        } catch (PersonajeException e) {
            Assertions.fail(MESSAGE_ERROR+":"+e.getMessage());
        }
    }

}
