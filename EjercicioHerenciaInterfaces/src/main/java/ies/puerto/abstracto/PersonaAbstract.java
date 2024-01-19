package ies.puerto.abstracto;

import java.util.Date;

public abstract class PersonaAbstract {
    private String nombre;
    private String fechaNacimiento;
    
    public abstract int anios(Date fechaNacimiento);
        
    
}
