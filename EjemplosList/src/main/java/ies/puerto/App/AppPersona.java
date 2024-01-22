package ies.puerto.App;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.imp.Persona;

public class AppPersona {
    static Persona ramon;
    static Persona juan;
    static String dni1 = "12345678D";
    static String dni2 = "98765432Q";
    static List<Persona> personas;

    public static void main(String[] args) {
        ramon = new Persona(dni1, "Ramon", "Gonzalez", "Perez");
        juan = new Persona(dni2, "Juan", "Gonzalez", "Perez");
        personas = new ArrayList<>();
        personas.add(ramon);
        personas.add(juan);
        Persona ramon2 = new Persona(dni1, "Ramon", "Gonzalez", "Perez");
        System.out.println(personas);
        if(personas.contains(ramon2)){
            System.out.println("La lista contiene a "+ramon);
        }

        System.out.println(ramon.media());
    }
    
}
