package ies.puerto;

/**
 * Objeto creado para administrar los datos de un estudiante.
 * @author ElliotDAM
 */
public class Estudiante{

    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    /**
     * Constructor por defecto
     */
    public Estudiante(){}

    /**
     * Constructores del objeto, para utilizarlos segun la necesidad.
     * @param nombre, edad, carrera, promedio
     */
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante(String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public Estudiante(String nombre, int edad, String carrera, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String infoEstudiante(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Promedio: " + promedio + ".";
    }

    public String comprobarAprobado(){
        if (promedio < 5){
            return "Esta suspendido";
        } else {
            return"Esta aprobado";
        }
       
    }
}