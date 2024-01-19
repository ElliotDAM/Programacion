package ies.puerto.impl;


import ies.puerto.abstracto.EmpleadoAbstract;
//import ies.puerto.abstracto.PersonaAbstract;

public class Profesor extends EmpleadoAbstract {//implements PersonaAbstract {
    private String especialidad;

    @Override
    public float salario() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    public boolean impartirClase(){
        return true;
    }

    

    
    
}
