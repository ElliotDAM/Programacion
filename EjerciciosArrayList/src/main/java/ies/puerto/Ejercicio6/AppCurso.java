package ies.puerto.Ejercicio6;

import java.util.ArrayList;

import ies.puerto.Ejercicio3.Alumno;


public class AppCurso {
    public static void main(String[] args) {
        Curso curso = new Curso();

        ArrayList<Float> calificaionesAlumno = new ArrayList<>();
        Alumno alumno = new Alumno("Pepe", "Dominguez", calificaionesAlumno);
        calificaionesAlumno.add(6.5f);
        calificaionesAlumno.add(5.5f);
        calificaionesAlumno.add(3.2f);

        curso.agregarAlumno(alumno);

        float media = curso.calcularMedia();

        System.out.println("Media de calificaciones del curso: "+media);
        
    }
}