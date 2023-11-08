package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTests {
    


    @Test
    public void testCreacionObjetoPersonaOk(String nombre, int edad, String email, int telefono){

        Persona persona = new Persona(nombre, edad, email, telefono);

        Assertions.assertEquals(nombre, persona.getNombre(), "El nombre de la persona no coincide.");
        Assertions.assertEquals(edad, persona.getEdad(), "La edad de la persona no coincide.");
        Assertions.assertEquals(email, persona.getEmail(), "El email no coincide.");
        Assertions.assertEquals(telefono, persona.getTelefono(), "El telefono no coincide.");
    }
    @Test
    public void testImprimirInformacionOk(){
        
        Persona persona = new Persona("Elliot", 29, "elliotrguez.8@gmail.com", 654098675);

        String infoEsperada = "Nombre: Elliot, Edad: 29, Email: elliotrguez.8@gmail.com, Telefono: 654098675";
        String infoObtenida = persona.imprimirInformacion();

        Assertions.assertEquals(infoEsperada, infoObtenida, "La informacion obtenida no coincide con la persona.");
    }

    @Test
    public void testCambiarNombreOk(){

        Persona persona = new Persona("Luis", 40, "luisdiaz@gmail.com", 123456789);

        persona.cambiarNombre("Luis Diaz");

        Assertions.assertEquals("Luis Diaz", persona.getNombre(), "El nombre no se cambio correctamente." );
        
    }   
}
