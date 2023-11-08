package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibroTests {
    
    @Test
    public void testCrearLibro(){

        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int anioPublicacion = 1605;

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        Assertions.assertEquals(titulo, libro.getTitulo(), "El titulo del libro no coincide.");
        Assertions.assertEquals(autor, libro.getAutor(), "El autor del libro no coincide.");
        Assertions.assertEquals(anioPublicacion, libro.getAnioPublicacion(), "El anio de publicacion no coincide.");

    }

    @Test
    public void testCambiarAutorOk(){

        String titulo ="Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int anioPublicacion = 1605 ;

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        String nuevoAutor = "Sancho Panza";
        libro.setAutor(nuevoAutor);

        Assertions.assertEquals(nuevoAutor, libro.getAutor(), "El autor no se ha cambiado correctamente.");
    }

    @Test
    public void testInfoLibroOk(){

        String titulo ="Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int anioPublicacion = 1605 ;

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        String libroEsperado = "Titulo: Don Quijote de la Mancha, Autor: Miguel de Cervantes, Anio Publicacion: 1605.";
        String libroObtenido = libro.infoLibro();

        Assertions.assertEquals(libroEsperado, libroObtenido, "La informacion del libro no coincide.");
    }
}
