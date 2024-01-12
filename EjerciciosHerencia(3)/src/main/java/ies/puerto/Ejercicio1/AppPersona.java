package ies.puerto.Ejercicio1;

public class AppPersona {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 23, "56879605D");

        persona.getNombre();
        persona.getEdad();
        persona.getDni();

        System.out.println("La persona con nombre "+persona.getNombre()+" edad: "+persona.getEdad()+" y dni: "+persona.getDni());

    }
}
