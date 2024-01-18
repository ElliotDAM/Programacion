package ies.puerto.impl;

import ies.puerto.abstracto.LecturaDatosAbstract;

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
