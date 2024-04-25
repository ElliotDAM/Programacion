package es.ies.puerto;

import es.ies.puerto.modelo.imp.Alias;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.OperacionesBd;
import es.ies.puerto.modelo.imp.Poder;

public class OperacionesBdTestAlias {
    static OperacionesBd operacionesBd;
    static String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    static Alias alias;

    @BeforeAll
    public static void beforeAll() {
        try {
            operacionesBd = new OperacionesBd(urlBd);
            alias = new Alias(4, 2, "El hombre arania");
            operacionesBd.insertarAlias(alias);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerAliasAllTest() {
        try {
            Set<Alias> lista = operacionesBd.obtenerAlias();
            Assertions.assertEquals(3, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerAliasTest() {
        Alias alias = new Alias(1, 1, "Tony Stark");
        try {
            alias =  (Alias) operacionesBd.obtenerAliasPorPersonaje(alias.getId());
            Assertions.assertNotNull(alias, MESSAGE_ERROR);
            Assertions.assertNotNull(alias.getPersonaje_id(), MESSAGE_ERROR);
            Assertions.assertNotNull(alias.getAlias(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void insertarEliminarAliasTest() {
        try {
            int numeroAlias = operacionesBd.obtenerAlias().size();
            operacionesBd.insertarAlias(alias);
            Alias aliasObtenido = (Alias) operacionesBd.obtenerAliasPorPersonaje(alias.getId());
            Assertions.assertEquals(alias, aliasObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarAlias(aliasObtenido.getId());
            int numeroAliasFinal = operacionesBd.obtenerAlias().size();
            Assertions.assertEquals(alias, aliasObtenido, MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() {
        int idUpdate = 2;
        int personajeIdUpdate = 1;
        String nombreAliasUpdate = "SpiderWoman";

        try {
            operacionesBd.insertarAlias(alias);
            alias.setId(idUpdate);
            alias.setAlias(nombreAliasUpdate);
            Alias aliasEncontrado = (Alias) operacionesBd.obtenerAliasPorPersonaje(alias.getId());
            Assertions.assertEquals(alias, aliasEncontrado, MESSAGE_ERROR);
            Assertions.assertEquals(alias.getAlias(), aliasEncontrado.getAlias(), MESSAGE_ERROR);
            operacionesBd.eliminarAlias(aliasEncontrado.getId());
        } catch (PersonajeException e) {
            Assertions.fail(MESSAGE_ERROR+":"+e.getMessage());
        }
    }
}
