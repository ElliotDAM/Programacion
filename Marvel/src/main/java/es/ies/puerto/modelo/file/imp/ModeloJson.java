package es.ies.puerto.modelo.file.imp;

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

import es.ies.puerto.modelo.file.abstracta.FicherosAbstract;
import es.ies.puerto.modelo.imp.Personaje;

public class ModeloJson extends FicherosAbstract {

    @Override
    public List<Personaje> leer() {
       List<Personaje> personajes = new ArrayList<>();
       try {
            String json = new String(Files.readAllBytes(Paths.get(jsonPath)));
            Type listType = new TypeToken<ArrayList<Personaje>>(){}.getType();
            personajes = new Gson().fromJson(json, listType);
       } catch (IOException ioException) {
        ioException.printStackTrace();
       }
       return personajes;
    }

    @Override
    public boolean actualizar(List<Personaje> personajes) {
        List<Personaje> listaExistente = leer();
        if (listaExistente.isEmpty()) {
            return false; 
        }
    
        for (Personaje personaje : personajes) {
            int index = listaExistente.indexOf(personaje);
            if (index != -1) {
                listaExistente.set(index, personaje);
            }
        }
    
        return escribir(listaExistente);
    }
    

    @Override
    public boolean escribir(List<Personaje> personajes) {
        try (FileWriter writer = new FileWriter(jsonPath)){
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes,writer);
            return true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean modificar(List<Personaje> personajes) {
        return actualizar(personajes); 
    }
    
}
