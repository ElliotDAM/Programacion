package es.ies.puerto.modelo.entity;

public class Cuidadopersonal extends Articulo{
    private int popularidad;

    public Cuidadopersonal(String id, String nombre, float precio, String fechaEntrada, int popularidad) {
        super(id, nombre, precio, fechaEntrada);
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Cuidadopersonal = id "+getId()+", nombre: "+getNombre()+", precio: "+getPrecio()+", fecha entrada: "+getFechaEntrada()+", popularidad: "+popularidad ;
    }

    @Override
    public String toCsv() {
        
        return getNombre()+DELIMITADOR+getPrecio()+DELIMITADOR+getFechaEntrada()+DELIMITADOR+getId();
    }

    
    
    
}
