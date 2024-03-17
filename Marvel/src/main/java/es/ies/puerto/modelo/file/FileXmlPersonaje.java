package es.ies.puerto.modelo.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.core.Persister;

import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.PersonajeList;
import es.ies.puerto.modelo.Personaje;

public class FileXmlPersonaje implements ICrudOperaciones{
    
    List<Personaje> personajes;
    String path = "src/main/resources/data.xml";

    public FileXmlPersonaje(){
        personajes = new ArrayList<>();
    }

    @Override
    public List<Personaje> obtenerPersonajes() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            PersonajeList personajeList = serializer.read(PersonajeList.class, file);
            personajes = personajeList.getPersonajes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return personajes;
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        if(!personajes.contains(personaje)){
            return null;
        }
        int posicion = personajes.indexOf(personaje);
        
        return personajes.get(posicion);
    }

    @Override
    public void addPersonaje(Personaje personaje) {
        if(personajes.contains(personaje)){
            return;
        }
        personajes.add(personaje);
        actualizarFichero(personajes);
        
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        if(personajes.contains(personaje)){
            return;
        }
        personajes.remove(personaje);
        actualizarFichero(personajes);
        
    }

    @Override
    public void updatePersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return;
        }
        int posicion = personajes.indexOf(personaje);
        personajes.set(posicion, personaje);
        actualizarFichero(personajes);
        
    }

    private void actualizarFichero(List<Personaje> personajes){
        PersonajeList personajeList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personajeList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
