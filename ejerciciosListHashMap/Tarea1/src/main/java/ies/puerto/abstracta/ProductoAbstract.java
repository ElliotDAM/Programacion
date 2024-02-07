package ies.puerto.abstracta;

import ies.puerto.interfaz.IProducto;

public abstract class ProductoAbstract implements IProducto {
    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String udi;

    public abstract float precioMaximo();
    public abstract int cantidadDisponible();
    public ProductoAbstract(){}

    public ProductoAbstract(String nombre, float precio, String fechaEntrada, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.udi = udi;
    }

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

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ProductoAbstract that = (ProductoAbstract) object;
        return java.lang.Float.compare(precio, that.precio) == 0 && java.util.Objects.equals(nombre, that.nombre) && java.util.Objects.equals(fechaEntrada, that.fechaEntrada) && java.util.Objects.equals(udi, that.udi);
    }


}