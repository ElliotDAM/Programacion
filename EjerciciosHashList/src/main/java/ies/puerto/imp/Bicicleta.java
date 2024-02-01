package main.java.ies.puerto.imp;

import Ejercicio2.Vehiculo;

public class Bicicleta extends Vehiculo{

    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);

    }

    @Override
    public int velocidadMaxima() {
       return 40;
    }
}
