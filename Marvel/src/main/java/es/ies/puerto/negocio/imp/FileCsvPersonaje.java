package es.ies.puerto.negocio.imp;

import java.util.List;
import es.ies.puerto.modelo.file.imp.ModeloCsv;
import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.negocio.interfaces.ICrudOperaciones;

public class FileCsvPersonaje implements ICrudOperaciones{
    private ModeloCsv modelo;

    public FileCsvPersonaje(){
        this.modelo = new ModeloCsv();
    }

    public List<Personaje> obtenerPersonajes() {
        return modelo.leer();
    }

    public Personaje obtenerPersonaje(Personaje personajeBuscado) {
        List<Personaje> personajes = modelo.leer(); 
        for (Personaje personaje : personajes) { 
            if (personaje.getNombre().equals(personajeBuscado.getNombre())) { 
                return personaje;
            }
        }
        return null; 
    }

    public boolean addPersonaje(Personaje personaje) {
        List<Personaje> personajes = modelo.leer();
        if(personajes.contains(personaje)){
            return false;
        }
            personajes.add(personaje);
            return modelo.escribir(personajes);
     
    }

    public boolean deletePersonaje(Personaje personaje) {
        List<Personaje> personajes = modelo.leer();
        if(!personajes.contains(personaje)){
            return false;
        }
            personajes.remove(personaje);
            return modelo.actualizar(personajes); 
    }

    public boolean updatePersonaje(Personaje personaje) {
        List<Personaje> personajes = modelo.leer();
        if (!personajes.contains(personaje)) {
             return false;
        }
        return modelo.actualizar(personajes);
    }


}
