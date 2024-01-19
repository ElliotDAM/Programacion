package ies.puerto.impl;

import ies.puerto.abstracto.ConexionRedAbstract;

public class ConexionWifi extends ConexionRedAbstract {

    @Override
    public String conectar() {
        return "Conectado por Wifi";
    }
    
}
