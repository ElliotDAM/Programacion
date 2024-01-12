package ies.puerto.Ejercicio1;

public class Alumno extends Persona {
    
    public Alumno(String nombre, int edad, String dni){
        super(nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "Alumno []";
    }

    
}
