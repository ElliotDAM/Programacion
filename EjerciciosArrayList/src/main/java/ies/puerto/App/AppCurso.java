package main.java.ies.puerto.App;

import java.util.List;

import main.java.ies.puerto.Curso;

public class AppCurso {
    public static void main(String[] args) {
        Curso curso = new Curso();

        List<Float> calificaionesAlumno = new ArrayList<>();
        Alumno alumno = new Alumno("Pepe", "Dominguez", calificaionesAlumno);
        calificaionesAlumno.add(6.5f);
        calificaionesAlumno.add(5.5f);
        calificaionesAlumno.add(3.2f);

        curso.agregarAlumno(alumno);

        float media = curso.calcularMedia();

        System.out.println("Media de calificaciones del curso: "+media);
        
    }
}