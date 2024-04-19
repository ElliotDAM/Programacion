package es.ies.puerto.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.PersonajeException;

public class ConfigProyectoTest {
    AppConfig appConfig;
    String url = "src/main/resources/personajes.db";

    @BeforeEach
    public void beforeEach() {
        try {
            appConfig = new AppConfig();
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUrlBd() {
        try {
            String urlBdFichero = appConfig.getUrlBd();
            Assertions.assertEquals(url, urlBdFichero, "la url de la BBDD no es la esperada");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
       
    }
}
