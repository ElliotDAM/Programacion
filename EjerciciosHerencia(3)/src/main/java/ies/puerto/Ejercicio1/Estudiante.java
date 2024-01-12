package ies.puerto.Ejercicio1;

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

    @Override
    public String toString() {
        return "Estudiante [curso=" + curso + ", notas=" + notas + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estudiante other = (Estudiante) obj;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        if (Double.doubleToLongBits(notas) != Double.doubleToLongBits(other.notas))
            return false;
        return true;
    }
}
