package ies.puerto.Ejercicios.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa una clase Alumno con atributos como nombre, apellido y calificaciones (un ArrayList de float). 
 * Crea instancias de esta clase para representar a varios alumnos y calcula el promedio de calificaciones. a la lista.
 * @author ElliotDAM
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private List<Float> calificaciones;
    
    public Alumno(String nombre, String apellido, List<Float> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = new ArrayList<>();
    }

    public float media(){
        float resultado = 0f;

        if(calificaciones.isEmpty()){
            return resultado;
        }

        for (Float calificacion : calificaciones) {
            resultado += calificacion;
        }

        return resultado / calificaciones.size();
    }

    

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", calificaciones=" + calificaciones + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    

    

    
}
