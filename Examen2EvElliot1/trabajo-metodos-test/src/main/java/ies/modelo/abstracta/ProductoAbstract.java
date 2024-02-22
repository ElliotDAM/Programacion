package ies.modelo.abstracta;



import java.util.Objects;

import ies.interfaces.IVendible;

public abstract class ProductoAbstract implements IVendible {
    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String identificador;

    public ProductoAbstract(String nombre, float precio, String fechaEntrada, String identificador) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.identificador = identificador;
    }

    @Override
    public abstract float precioMaximo();

    @Override
    public abstract int cantidadDisponible();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "ProductoAbstract{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", identificador='" + identificador + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProductoAbstract that = (ProductoAbstract) object;
        return Objects.equals(identificador, that.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }
}