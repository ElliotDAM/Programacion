package es.ies.puerto.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import es.ies.puerto.exception.PersonajeException;

public class AppConfig {
String urlBd;
    public AppConfig() throws PersonajeException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/app.properties")) {
            properties.load(fis);
            urlBd = (String) properties.get("urlBd");
        } catch (IOException e) {
            throw new PersonajeException(e.getMessage(),e);
        }
    }

    public String getUrlBd() {
        return urlBd;
    }

}
