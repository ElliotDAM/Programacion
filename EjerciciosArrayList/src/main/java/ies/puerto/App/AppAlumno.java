package main.java.ies.puerto.App;

import java.util.ArrayList;
import java.util.List;

import main.java.ies.puerto.Alumno;

public class AppAlumno {
    public static void main(String[] args) {
        List<Float> calificacionesAlumno = new ArrayList<>();
        calificacionesAlumno.add(5.2f);
        calificacionesAlumno.add(6.5f);
        calificacionesAlumno.add(4.2f);
        Alumno alumno = new Alumno("Pedro", "Garcia", calificacionesAlumno);
        
        float promedio = alumno.calcularPromedio();
        System.out.println("Promedio de calificaciones del alumno: "+promedio);
        
    }
}
