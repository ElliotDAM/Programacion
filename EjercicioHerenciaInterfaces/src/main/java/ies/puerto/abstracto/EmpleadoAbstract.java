package ies.puerto.abstracto;

import ies.puerto.interfaz.ITrabajador;

public abstract class EmpleadoAbstract implements ITrabajador {
    private float salario;
    private String trabajo;

    public abstract float salario();
    public abstract String toString();
    
    @Override
    public String trabajar() {
        return "Estoy trabajando";
    }
    
}
