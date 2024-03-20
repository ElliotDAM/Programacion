package es.ies.puerto.negocio.interfaces;


import es.ies.puerto.modelo.imp.Personaje;

import java.util.List;

public interface ICrudOperaciones {
    public List<Personaje> obtenerPersonajes();
    public Personaje obtenerPersonaje(Personaje personaje);
    public void addPersonaje(Personaje personaje);
    public void deletePersonaje(Personaje personaje);
    public void updatePersonaje(Personaje personaje);
}
