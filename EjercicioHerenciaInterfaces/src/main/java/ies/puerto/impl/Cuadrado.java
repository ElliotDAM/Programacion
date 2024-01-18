package main.java.ies.puerto.impl;

import main.java.ies.puerto.abstracto.RegularesAbstract;
import main.java.ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstract implements IFormaGeometrica{

    public Cuadrado(float lado){
        super(lado, lado);
    }
    public Cuadrado(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return getAltura() * getBase();
    }
    
}
