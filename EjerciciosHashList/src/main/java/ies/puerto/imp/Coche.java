package ies.puerto.imp;

import ies.puerto.abstracta.VehiculoAbstract;

public class Coche extends VehiculoAbstract{

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
        
    }

    @Override
    public int velocidadMaxima() {
       return 180;
    }
    
}
