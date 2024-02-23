package ies.modelo.entity;


import ies.modelo.abstracta.ProductoRecomendableAbstract;

public class CuidadoPersonal  extends ProductoRecomendableAbstract {

    private int popularidad;

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String identificador, int popularidad) {
        super(nombre, precio, fechaEntrada, identificador);
        this.popularidad = popularidad;
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 1.8f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public boolean recomendarProducto() {
        if (popularidad >= 7) {
            return true;
        }
        return false;
    }

    @Override
    public int calcularPopularidad() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularPopularidad'");
    }

    ;

}
