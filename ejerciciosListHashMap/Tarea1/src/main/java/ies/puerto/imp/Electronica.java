package ies.puerto.imp;

import ies.puerto.abstracta.ProductoAbstract;

public class Electronica extends ProductoAbstract {
    public Electronica(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        double porcentaje = 0.6;
        float precioMaximo = (float) (getPrecio() * porcentaje);
        return precioMaximo;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
