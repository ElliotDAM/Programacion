package es.ies.puerto.modelo.file.interfaz;

import java.util.List;

import es.ies.puerto.modelo.imp.Personaje;
public interface IFicheros {
    
    public List<Personaje> leer();
    public boolean eliminar(String path);
    public boolean existe(String path);
    public boolean actualizar(List<Personaje> personajes);
    public boolean escribir(List<Personaje> personajes);
    public boolean modificar(List<Personaje> personajes);
}
