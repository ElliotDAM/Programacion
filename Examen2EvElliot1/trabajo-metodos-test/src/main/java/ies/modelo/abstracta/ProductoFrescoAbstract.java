package ies.modelo.abstracta;

import ies.interfaces.ISaludable;

import java.util.Objects;

public abstract class ProductoFrescoAbstract extends ProductoAbstract implements ISaludable {

    private String fechaCaducidad;
 
    public ProductoFrescoAbstract(String nombre, float precio, String fechaEntrada, String identificador, String fechaCaducidad){
        super(nombre, precio, fechaEntrada, identificador);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "ProductoFrescoAbstract{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ProductoFrescoAbstract that = (ProductoFrescoAbstract) object;
        return Objects.equals(fechaCaducidad, that.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad);
    }

    @Override
    public abstract int diasDisponible();

    @Override
    public abstract boolean caducado();


}