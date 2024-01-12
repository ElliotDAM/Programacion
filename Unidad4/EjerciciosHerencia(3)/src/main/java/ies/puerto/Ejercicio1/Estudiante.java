package main.java.ies.puerto.Ejercicio1;

public class Estudiante extends Persona{
    private String curso;
    private double notas;


    public Estudiante(){}

    public Estudiante(String nombre, int edad, String dni, String curso, double notas){
        super(nombre, edad, dni);
        this.curso = curso;
        this.notas = notas;

    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public double getNotas(){
        return notas;
    }

    public void setNotas(double notas){
        this.notas = notas;
    }

    @Override
    public String saludar(){
        return "Hola, soy un estudiante";
    }
}
