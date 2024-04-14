package es.ies.puerto.modelo.imp;

import java.util.List;

public class Poder {
    
    private int idPoder;
    private int idPersonajePoder;
    private String nombrePoder;
    
    public Poder() {
    }
    
    public Poder(int idPoder, int idPersonajePoder, String nombrePoder) {
        this.idPoder = idPoder;
        this.idPersonajePoder = idPersonajePoder;
        this.nombrePoder = nombrePoder;
    }
    public int getIdPoder() {
        return idPoder;
    }
    public void setIdPoder(int idPoder) {
        this.idPoder = idPoder;
    }
    public int getIdPersonajePoder() {
        return idPersonajePoder;
    }
    public void setIdPersonajePoder(int idPersonajePoder) {
        this.idPersonajePoder = idPersonajePoder;
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
        return "Poder [idPoder=" + idPoder + ", idPersonajePoder=" + idPersonajePoder + ", nombrePoder=" + nombrePoder
                + "]";
    }
    
    
}
