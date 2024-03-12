package main.java.es.ies.puerto.modelo.file;

import java.util.List;

import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.interfaces.Personaje;

public class FileXmlPersonaje implements ICrudOperaciones{
    
    List<Personaje> personajes;
    String path = "src/main/resources/data.xml";

    public FileXmlPersonaje(){
        personas = new ArrayList<>();
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addPersonaje(Personaje personaje) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updatePersonaje(Personaje personaje) {
        // TODO Auto-generated method stub
        
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
