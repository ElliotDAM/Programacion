package es.ies.puerto.modelo.imp;


import java.util.Set;

public class Personaje {
    
    private int id;
    private String nombre;
    private String genero;
    private Set<String> poderes;

    public Personaje(int id, String nombre, String genero, Set<String> poderes) {
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

    public Set<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Personaje [id"+ id +"nombre=" + nombre + ", genero=" + genero + ", poderes=" + poderes + "]";
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







    
}
