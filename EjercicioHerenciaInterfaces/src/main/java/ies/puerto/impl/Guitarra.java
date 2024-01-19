package ies.puerto.impl;

import ies.puerto.abstracto.GuitarraAbstract;

public class Guitarra extends GuitarraAbstract{

    @Override
    public String tocarNota(String nota) {
        return "Se toca la nota "+nota;
    }

    @Override
    public String afinar() {
        return "Se afina la guitarra";
    }
    
    public String cambiarCuerdas(){
        return "Se cambian las cuerdas.";
    }
}
