package ies.puerto.imp;

import ies.puerto.abstracta.ProductoAbstract;

public class Souvenir extends ProductoAbstract {
    public Souvenir(String nombre, float precio, String fechaEntrada, String udi) {
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 0.4f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
