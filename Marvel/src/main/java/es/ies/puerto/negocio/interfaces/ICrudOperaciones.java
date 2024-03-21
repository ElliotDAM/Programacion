package es.ies.puerto.negocio.interfaces;


import es.ies.puerto.modelo.imp.Personaje;

import java.util.List;

public interface ICrudOperaciones {
    public List<Personaje> obtenerPersonajes();
    public Personaje obtenerPersonaje(Personaje personaje);
    public boolean addPersonaje(Personaje personaje);
    public boolean deletePersonaje(Personaje personaje);
    public boolean updatePersonaje(Personaje personaje);
}
