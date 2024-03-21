package es.ies.puerto.modelo.file;


import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.negocio.imp.FileCsvPersonaje;
import es.ies.puerto.negocio.interfaces.ICrudOperaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileCsvTest {

        String nombre = "Tony Stark";
        String alias = "Iron Man";
        String genero = "";
        List<String> poderes = new ArrayList<>();

    ICrudOperaciones persistencia;

    List<Personaje> personajes;

    @BeforeEach
    public void beforeEach() {

        persistencia = new FileCsvPersonaje();
        personajes = persistencia.obtenerPersonajes();
    }

    @Test
    public void obtenerPersonajesTest() {
        Assertions.assertFalse(personajes.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonajeTest() {
        Personaje personajeBuscar = new Personaje(nombre);
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
    public void addDeletePersonajeTest() {

        int numPersonasInicial = personajes.size();
        Personaje personajeInsertar = new Personaje(nombre, alias, genero, poderes);
        persistencia.addPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonasInsertar = personajes.size();
        Assertions.assertTrue(personajes.contains(personajeInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");
        persistencia.deletePersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonasBorrado = personajes.size();
        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersonaje() {
        String nombreActualizar = "Iron Man";
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
