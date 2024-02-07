package ies.puerto.imp;

import ies.puerto.abstracta.ProductoAbstract;

public class Souvenir extends ProductoAbstract {
    @Override
    public float precioMaximo() {
        double porcentaje = 0.4;
        float precioMaximo = (float) (getPrecio() * porcentaje);
        return precioMaximo;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
