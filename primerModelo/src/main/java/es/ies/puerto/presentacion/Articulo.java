package es.ies.puerto.presentacion;

public abstract class Articulo {
    private String id;
    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String fechaCaducidad;
    
    public Articulo(String id, String nombre, float precio, String fechaEntrada, String fechaCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fechaEntrada=" + fechaEntrada
                + ", fechaCaducidad=" + fechaCaducidad + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Articulo other = (Articulo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
