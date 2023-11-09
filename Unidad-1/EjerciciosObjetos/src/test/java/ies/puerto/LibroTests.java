package ies.puerto;

import org.junit.jupiter.api.BeforeEach;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibroTests {

    /**
     * Se instancian los atributos y la clase para que se utilice para todas las pruebas.
     */
    String titulo = "Don Quijote de la Mancha";
    String autor = "Miguel de Cervantes";
    int anioPublicacion = 1605;

    Libro libro;

    /**
     * Metodo de test que se utiliza para instanciar una clase para todas las pruebas de cada test unitario.
     */
    @BeforeEach
    public void beforeEach(){
        libro = new Libro(titulo, autor, anioPublicacion);
    }

    @Test
    public void testCrearLibro(){

        Assertions.assertEquals(titulo, libro.getTitulo(), "El titulo del libro no coincide.");
        Assertions.assertEquals(autor, libro.getAutor(), "El autor del libro no coincide.");
        Assertions.assertEquals(anioPublicacion, libro.getAnioPublicacion(), "El anio de publicacion no coincide.");

    }

    @Test
    public void testCambiarAutorOk(){

        String nuevoAutor = "Sancho Panza";
        libro.setAutor(nuevoAutor);

        Assertions.assertEquals(nuevoAutor, libro.getAutor(), "El autor no se ha cambiado correctamente.");
    }

    @Test
    public void testInfoLibroOk(){

        String libroEsperado = "Titulo: Don Quijote de la Mancha, Autor: Miguel de Cervantes, Anio Publicacion: 1605.";
        String libroObtenido = libro.infoLibro();

        Assertions.assertEquals(libroEsperado, libroObtenido, "La informacion del libro no coincide.");
    }

    @Test
    public void testSetTituloOk(){
        
        String miTitulo = "Otro titulo";

        libro.setTitulo(miTitulo);

        Assertions.assertEquals(miTitulo, libro.getTitulo(), "El titulo no coincide.");
    }

    @Test
    public void testSetAnioPublicacionOk(){

        int otroAnio = 2000;

        libro.setAnioPublicacion(otroAnio);

        Assertions.assertEquals(otroAnio, libro.getAnioPublicacion(), "El año no coincide.");
    }

     
}
