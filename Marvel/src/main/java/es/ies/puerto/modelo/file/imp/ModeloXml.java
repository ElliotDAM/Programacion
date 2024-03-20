package es.ies.puerto.modelo.file.imp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.core.Persister;

import es.ies.puerto.modelo.imp.PersonajeList;
import es.ies.puerto.modelo.file.abstracta.FicherosAbstract;
import es.ies.puerto.modelo.imp.Personaje;

public class ModeloXml extends FicherosAbstract {

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        if(existe(xmlPath)){
            Persister serializer = new Persister();
            File file = new File(xmlPath);
            try {
                PersonajeList personajeList = serializer.read(PersonajeList.class, file);
                personajes = personajeList.getPersonajes();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personajes;
    }

    @Override
    public boolean actualizar(List<Personaje> personajes) {
        PersonajeList personajeList = new PersonajeList(personajes);
        try {
            Persister serializer = new Persister();
            serializer.write(personajeList, new File(xmlPath));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean escribir(List<Personaje> personajes) {
       return actualizar(personajes);
    }

    @Override
    public boolean modificar(List<Personaje> personajes) {
        return actualizar(personajes);
    }
    
}
