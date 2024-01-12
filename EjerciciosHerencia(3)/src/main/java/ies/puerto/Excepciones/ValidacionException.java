package ies.puerto.Excepciones;

import Ejercicio1.Persona;

public class ValidacionException extends Exception {
    public static void main(String[] args) {

      try{
        Persona persona = new Persona("Pepe", 22, "6879058D");
    }catch(Exception exception){
        System.out.println("Ha surgido una excepcion. No has escrito en el formato adecuado.");
    }

    }
    
}
