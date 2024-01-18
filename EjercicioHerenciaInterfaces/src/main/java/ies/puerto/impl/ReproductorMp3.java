package main.java.ies.puerto.impl;

import main.java.ies.puerto.interfaz.IReproductor;

public class ReproductorMp3 implements IReproductor{

    @Override
    public String detener() {
        return "Reproduciendo mp3";
    }

    @Override
    public String reproducir() {
        return "Deteniendo mp3";
    }
    
}
