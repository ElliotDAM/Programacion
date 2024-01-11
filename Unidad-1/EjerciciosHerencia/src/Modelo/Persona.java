package Modelo;
import Acceso.Autenticacion;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    
    public Persona() {
    }
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+", edad: "+edad+", dni: "+dni;
    }

    public static String saludar(){
        return "Hola, soy una persona.";
    }

    public static boolean autenticar(String usuario, String contrasenia){
        return Autenticacion.validacion(usuario, contrasenia);
    }

    
}
