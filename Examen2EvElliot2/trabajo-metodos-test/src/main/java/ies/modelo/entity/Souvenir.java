package ies.modelo.entity;

import ies.modelo.abstracta.ProductoAbstract;

public class Souvenir extends ProductoAbstract {
    public Souvenir(String nombre, float precio, String fechaEntrada, String identificador) {
        super(nombre, precio, fechaEntrada, identificador);
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 1.3f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
