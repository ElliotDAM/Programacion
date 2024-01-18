package ies.puerto.impl;

import ies.puerto.abstracto.ConductorAbstract;
import ies.puerto.interfaz.IConductor;

public class Automovil extends ConductorAbstract implements IConductor {

    public Automovil(){}
    
    @Override
    public String arrancar() {
       return "Se arranca";
        
    }

    @Override
    public String detener() {
        return "Se detiene";
    }

    public String conducir(){
        return "Conduciendo";
    }
    
}
