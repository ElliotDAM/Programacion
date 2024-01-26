package ies.puerto.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.Ejercicio3.Alumno;
/**
 * 
 */


public class Curso {
    private List<Alumno> alumnos;
    private Alumno alumno;

    public Curso(){
        this.alumnos = new ArrayList<>();
    }

    public Curso(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }

    public float calcularMedia(){

        if(alumnos.isEmpty()){
            return 0;
        }

        float sumaTotal = 0;
        
        for(Alumno alumno : alumnos){
            sumaTotal += calcularPromedio(alumno);
            
        }

        return sumaTotal / alumnos.size();

    }

    public float calcularPromedio(Alumno alumno){
        return alumno.calcularPromedio();
    }
}
