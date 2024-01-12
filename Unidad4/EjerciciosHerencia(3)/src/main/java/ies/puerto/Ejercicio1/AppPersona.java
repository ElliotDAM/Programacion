package main.java.ies.puerto.Ejercicio1;
import Ejercicio1.Persona;
public class AppPersona {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 23, "56879605D");

        persona.getNombre();
        persona.getEdad();
        persona.getDni();

    }
}
