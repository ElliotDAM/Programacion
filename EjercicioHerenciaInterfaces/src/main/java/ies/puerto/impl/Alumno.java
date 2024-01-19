package ies.puerto.impl;

import java.util.Date;
import ies.puerto.abstracto.PersonaAbstract;

public class Alumno extends PersonaAbstract {
    private String nivel;

    @Override
    public int anios() {
        Date fechaHoy = new Date();
       //Hacer resta anios.
        return 0;
    }


    public String estudiar(){
        return "Tienes que estudiar";
    }
    
}
