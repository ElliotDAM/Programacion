package es.ies.puerto.modelo.imp;

public class Poder {
    
    private int id;
    private String nombre;
    
    public Poder() {
    }
    
    public Poder(int idPoder, String nombrePoder) {
        this.id = idPoder;
        this.nombre = nombrePoder;
    }
    public int getIdPoder() {
        return id;
    }
    public void setIdPoder(int idPoder) {
        this.id = idPoder;
    }
    public String getNombrePoder() {
        return nombre;
    }
    public void setNombrePoder(String nombrePoder) {
        this.nombre = nombrePoder;
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
        Poder other = (Poder) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Poder [idPoder=" + id + ", nombrePoder=" + nombre
                + "]";
    }
    
    
}
