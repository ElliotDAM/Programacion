package es.ies.puerto.modelo.imp;

import java.util.Set;

public class Personaje {
    
    private int id;
    private String nombre;
    private String genero;
    private Set<Poder> poderes;

    public Personaje(int id, String nombre, String genero, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.poderes = poderes;
    }

    public Personaje(){}

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Personaje [id"+ id +"nombre=" + nombre + ", genero=" + genero + "poderes = "+poderes+"]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Poder> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }







    
}
