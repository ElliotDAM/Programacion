package ies.modelo.entity;

import ies.modelo.abstracta.ProductoAbstract;

public class Aparato extends ProductoAbstract {

    public Aparato(String nombre, float precio, String fechaEntrada, String identificador) {
        super(nombre, precio, fechaEntrada, identificador);
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 1.42f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
