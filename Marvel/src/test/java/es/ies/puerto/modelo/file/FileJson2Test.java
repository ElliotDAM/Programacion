package es.ies.puerto.modelo.file;


import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileJson2Test {

        String nombre = "nombre";
        String alias = "alias";
        String genero = "genero";
        List<String> poderes;

    ICrudOperaciones persistencia;

    List<Personaje> personajes;

    @BeforeEach
    public void beforeEach() {

        persistencia = new FileJsonPersonaje();
        personajes = persistencia.obtenerPersonajes();
    }

    @Test
    public void obtenerPersonasTest() {
        Assertions.assertFalse(personajes.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonaTest() {
        Personaje personajeBuscar = new Personaje("pedro");
        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.getNombre(),nombre,
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals(personajeBuscar.getAlias(),alias,
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals (personajeBuscar.getGenero(),genero,
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals(personajeBuscar.getPoderes(),poderes,
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonaTest() {

        int numPersonajesInicial = personajes.size();
        Personaje personajeInsertar = new Personaje(nombre, alias, genero, poderes);
        persistencia.addPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonasInsertar = personajes.size();
        Assertions.assertTrue(personajes.contains(personajeInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonajesInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");
        persistencia.deletePersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonajesBorrado = personajes.size();
        Assertions.assertEquals(numPersonajesInicial ,
                numPersonajesBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersona() {
        String nombreActualizar = "pepe";
        Personaje personajeBuscar = new Personaje(nombreActualizar);
        Personaje personajeActualizar = persistencia.obtenerPersonaje(personajeBuscar);
        Personaje personajeBackup = persistencia.obtenerPersonaje(personajeBuscar);
        personajeActualizar.setNombre(nombre);
        personajeActualizar.setAlias(alias);
        personajeActualizar.setGenero(genero);
        personajeActualizar.setPoderes(poderes);
        persistencia.updatePersonaje(personajeActualizar);

        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.toString(), personajeActualizar.toString(),
                "Los datos actualizados no son los esperados");
        persistencia.updatePersonaje(personajeBackup);



    }
}
