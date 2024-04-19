package es.ies.puerto.modelo.imp;

public class Poder {
    
    private int idPoder;
    private String nombrePoder;
    
    public Poder() {
    }
    
    public Poder(int idPoder, String nombrePoder) {
        this.idPoder = idPoder;
        this.nombrePoder = nombrePoder;
    }
    public int getIdPoder() {
        return idPoder;
    }
    public void setIdPoder(int idPoder) {
        this.idPoder = idPoder;
    }
    public String getNombrePoder() {
        return nombrePoder;
    }
    public void setNombrePoder(String nombrePoder) {
        this.nombrePoder = nombrePoder;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idPoder;
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
        if (idPoder != other.idPoder)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Poder [idPoder=" + idPoder + ", nombrePoder=" + nombrePoder
                + "]";
    }
    
    
}
