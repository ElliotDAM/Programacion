package ies.puerto.imp;

import ies.puerto.abstracta.ProductoAbstract;

public class Alimento extends ProductoAbstract{


    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        double porcentaje = 0.23;
        float precioMaximo = (float) (getPrecio() * porcentaje);
        return precioMaximo;
    }

    @Override
    public int cantidadDisponible() {

        return 0;
    }

    public static int diasDisponible(){

        return 0;
    }

    public static boolean caducado(){

        return false;
    }
}