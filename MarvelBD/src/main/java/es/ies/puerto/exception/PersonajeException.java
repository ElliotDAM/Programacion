package es.ies.puerto.exception;

public class PersonajeException extends Exception{

    public PersonajeException(String mensaje){
        super(mensaje);
    }

    public PersonajeException(String mensaje, Throwable tipo){
        super(mensaje, tipo);
    }
    
}
