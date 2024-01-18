package ies.puerto.impl;

import ies.puerto.abstracto.RegularesAbstract;
import ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstract implements IFormaGeometrica{

    public Cuadrado(float lado){
        super(lado, lado);
    }
    public Cuadrado(float base, float altura) {
        super(base, altura);
    }
    
}
