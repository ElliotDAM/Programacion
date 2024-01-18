package ies.puerto.App;

import ies.puerto.abstracto.ConductorAbstract;
import ies.puerto.impl.Automovil;

public class AppConductor {
    static ConductorAbstract automovil;
    public static void main(String[] args) {
        automovil = new Automovil();
        System.out.println(automovil.arrancar());
        System.out.println(automovil.detener());
        System.out.println(automovil.conducir());


    }
}
