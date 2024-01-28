package ies.puerto.ParteDos.App;

import java.util.ArrayList;
import java.util.List;

import ies.puerto.ParteDos.imp.Alumno;
import ies.puerto.ParteDos.imp.Aula;
import ies.puerto.ParteDos.imp.Nota;
import ies.puerto.ParteDos.imp.Profesor;

public class AppAula {
    static List<Nota> notas;
        public static void main(String[] args) {
            
        
        Profesor profesor1 = new Profesor("Maria", "12345678A", "01/01/1980", 50000.0f, "Matemáticas");
        Profesor profesor2 = new Profesor("Domingo", "23456789B", "15/05/1975", 55000.0f, "Historia");

       
        Alumno alumno1 = new Alumno("Silvia", "34567890C", "15/05/2000", notas);
        Alumno alumno2 = new Alumno("Bobby", "45678901D", "20/03/1999", notas);

        
        List<Alumno> alumnosAula1 = new ArrayList<>();
        alumnosAula1.add(alumno1);
        alumnosAula1.add(alumno2);

        
        Aula aula1 = new Aula("Aula 101", profesor1, alumnosAula1);

        System.out.println("Información del Aula:"+aula1.toString());
        System.out.println("Media de la Clase: " + aula1.mediaClase());

    }
}
