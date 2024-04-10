package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.Conexion;

public class ConexionTest {
    Conexion conexion;
    String url = "src/main/resources/personajes.db";

    @BeforeEach
    public void beforeEach(){
        try {
            conexion = new Conexion(url);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void conectarBd(){
        try {
            conexion.getConexion();
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }
}
