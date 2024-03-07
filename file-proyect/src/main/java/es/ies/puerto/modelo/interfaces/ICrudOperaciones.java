package es.ies.puerto.modelo.interfaces;

import java.util.List;

import es.ies.puerto.modelo.Persona;

public interface ICrudOperaciones {
    
    public List<Persona> obtenerPersonas();
    public Persona obtenerPersona(Persona persona);
    public void addPersona(Persona persona);
    public void deletePersona(Persona persona);
    public void updatePersona(Persona persona);
}
