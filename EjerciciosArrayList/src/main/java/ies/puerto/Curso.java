package main.java.ies.puerto;

import java.util.List;

public class Curso {
    private List<Alumno> listaAlumnos;

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
        float sumaTotal = 0;
        float totalAlumnos = 0;
        
        for(Alumno alumno : listaAlumnos){
            sumaTotal += calcularPromedio(alumno);
            totalAlumnos++;
        }

        return sumaTotal / totalAlumnos;

    }

    public float calcularPromedio(Alumno alumno){
        return alumno.calcularPromedio();
    }
}
