package es.ies.puerto.negocio.imp;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.negocio.interfaces.ICrudOperaciones;

public class FileJsonPersonaje implements ICrudOperaciones{
    List<Personaje> personajes;
    String path="src/main/resources/data.json";

    public FileJsonPersonaje() {
        personajes = new ArrayList<>();
    }


    @Override
    public List<Personaje> obtenerPersonajes() {
        String json = null;
        try {
            json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Personaje>>(){}.getType();
            personajes =new Gson().fromJson(json, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return personajes;
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return null;
        }
        int posicion = personajes.indexOf(personaje);
        return personajes.get(posicion);
    }

    @Override
    public boolean addPersonaje(Personaje personaje) {
        if (personajes.contains(personaje)) {
            return false;
        }
        personajes.add(personaje);
        guardarDatos(personajes);
        return true;
    }

    @Override
    public boolean deletePersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return false;
        }
        personajes.remove(personaje);
        guardarDatos(personajes);
        return true;
    }

    @Override
    public boolean updatePersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return false;
        }
        int posicion = personajes.indexOf(personaje);
        personajes.set(posicion,personaje);
        guardarDatos(personajes);
        return true;
    }

    private void guardarDatos(List<Personaje> personajes) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
