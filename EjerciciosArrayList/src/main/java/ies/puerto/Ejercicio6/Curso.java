package ies.puerto.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.Ejercicio3.Alumno;
/**
 * 
 */


public class Curso {
    private List<Alumno> listaAlumnos;
    private Alumno alumno;

    public Curso(){
        this.listaAlumnos = new ArrayList<>();
    }

    public Curso(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno){
        listaAlumnos.remove(alumno);
    }

    public float calcularMedia(){

        if(listaAlumnos.isEmpty()){
            return 0;
        }

        float sumaTotal = 0;
        
        for(Alumno alumno : listaAlumnos){
            sumaTotal += calcularPromedio(alumno);
            
        }

        return sumaTotal / listaAlumnos.size();

    }

    public float calcularPromedio(Alumno alumno){
        return alumno.calcularPromedio();
    }
}
