package es.ies.puerto.negocio.imp;

import java.util.List;
import es.ies.puerto.modelo.file.imp.ModeloXml;
import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.negocio.interfaces.ICrudOperaciones;

public class FileXmlPersonaje implements ICrudOperaciones{

    private ModeloXml modelo;

    public FileXmlPersonaje() {
        this.modelo = new ModeloXml();
    }

    public List<Personaje> obtenerPersonajes() {
        return modelo.leer();
    }

    public Personaje obtenerPersonaje(Personaje personaje) {
        List<Personaje> personajes = modelo.leer();
        for (Personaje personaje1 : personajes) {
            if (personaje1.equals(personaje)) {
                return personaje1;
            }
        }
        return null;
    }

    public boolean addPersonaje(Personaje personaje) {
        List<Personaje> personajes = modelo.leer();
        if (personajes.contains(personaje)) {
            return false;
        }
        personajes.add(personaje);
        return modelo.escribir(personajes);
    }

    public boolean deletePersonaje(Personaje personaje) {
        List<Personaje> personajes = modelo.leer();
        if (!personajes.contains(personaje)) {
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

