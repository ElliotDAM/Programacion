package ies.puerto
/**
 * Clase persona hecha como ejemplo.
 * @author ElliotDAM
 */
public class Persona {

    private String nombre;
    private int edad;
    private String email;
    private int telefono;

    /**
     * Constructor por defecto de la clase.
     */
    public Persona(){}

    /**
     * Constructor con el parametro nombre.
     * @param nombre de la persona
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }

    /**
     * Constructor con el parametro nombre y edad.
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor con el nombre, edad y email.
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona(String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Constructor con el nombre, edad, email y telefono.
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona(String nombre, int edad, String email, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Getters/Setters de la clase.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    /*
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
    }
    */
    public String imprimir(){

        return "Nombre: "+ nombre + "Edad: " + edad + "Email: " + email + "Telefono: " + telefono ;
    }




}