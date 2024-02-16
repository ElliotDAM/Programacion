package es.ies.puerto.modelo.entity;

import static es.ies.puerto.modelo.entity.Articulo.DELIMITADOR;

public class Aparato extends Articulo{

    private static final String DELIMITADOR = null;
    public Aparato(String id, String nombre, float precio, String fechaEntrada) {
        super(id, nombre, precio, fechaEntrada);
    }

    @Override
    public String toString() {
        return "Articulo [id=" + getId() + ", nombre=" + getNombre() + ", precio=" + getPrecio() + ", fechaEntrada=" + getFechaEntrada()
                +"]";
    }
    @Override
     public String toCsv(){
        return getNombre()+DELIMITADOR+getPrecio()+DELIMITADOR+getFechaEntrada()+DELIMITADOR+getId();
    }
    
}
