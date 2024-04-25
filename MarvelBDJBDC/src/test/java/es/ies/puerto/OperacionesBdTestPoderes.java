package es.ies.puerto;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.OperacionesBd;
import es.ies.puerto.modelo.imp.Poder;

public class OperacionesBdTestPoderes {
    static OperacionesBd operacionesBd;
    static String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    static Poder poder;

    @BeforeAll
    public static void beforeAll() {
        try {
            operacionesBd = new OperacionesBd(urlBd);
            poder = new Poder(3, "RayosX");
            operacionesBd.insertarPoderes(poder);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPoderesAllTest() {
        try {
            Set<Poder> lista = operacionesBd.obtenerPoderesPersonajes();
            Assertions.assertEquals(3, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPoderTest() {
        Poder poder = new Poder(1, "Vuelo");
        try {
            poder = (Poder) operacionesBd.obtenerPoderesPersonaje(poder.getIdPoder());
            Assertions.assertNotNull(poder, MESSAGE_ERROR);
            Assertions.assertNotNull(poder.getNombrePoder(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void insertarEliminarPoderesTest() {
        try {
            int numeroPoderes = operacionesBd.obtenerPoderesPersonajes().size();
            operacionesBd.insertarPoderes(poder);
            Poder poderObtenido = (Poder) operacionesBd.obtenerPoderesPersonaje(poder.getIdPoder());
            Assertions.assertEquals(poder, poderObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarPoderes(poderObtenido.getIdPoder());
            int numeroPoderesFinal = operacionesBd.obtenerPoderesPersonajes().size();
            Assertions.assertEquals(poder, poderObtenido, MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() {
        int idUpdate = 3;
        String nombrePoderUpdate = "Flexibilidad";

        try {
            operacionesBd.insertarPoderes(poder);
            poder.setIdPoder(idUpdate);
            poder.setNombrePoder(nombrePoderUpdate);
            Poder poderEncontrado = (Poder) operacionesBd.obtenerPoderesPersonaje(poder.getIdPoder());
            Assertions.assertEquals(poder, poderEncontrado, MESSAGE_ERROR);
            Assertions.assertEquals(poder.getNombrePoder(), poderEncontrado.getNombrePoder(), MESSAGE_ERROR);
            operacionesBd.eliminarPoderes(poderEncontrado.getIdPoder());
        } catch (PersonajeException e) {
            Assertions.fail(MESSAGE_ERROR+":"+e.getMessage());
        }
    }
}
