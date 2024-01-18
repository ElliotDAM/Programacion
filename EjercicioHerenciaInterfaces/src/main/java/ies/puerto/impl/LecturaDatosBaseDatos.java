package main.java.ies.puerto.impl;

import main.java.ies.puerto.abstracto.LecturaDatosAbstract;
import main.java.ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract{

    @Override
    public String apertura() {
        return "Apertura desde BBDD";
    }

    @Override
    public String cierre() {
        return "Cierre desde BBDD";
    }

    @Override
    public String lectura() {
        return "Lectura desde BBDD";
    }
    
}
