package ies.puerto.impl;

import ies.puerto.abstracto.ConexionRedAbstract;
 public class ConexionEthernet extends ConexionRedAbstract {

    @Override
    public String conectar() {
        return "Conectado por Ethernet";
    }
    
}
