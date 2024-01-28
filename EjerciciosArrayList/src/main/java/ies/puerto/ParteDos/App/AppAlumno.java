package ies.puerto.ParteDos.App;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import ies.puerto.ParteDos.imp.Alumno;
import ies.puerto.ParteDos.imp.Nota;

public class AppAlumno {
    static List<Nota> notas;
    static List<Alumno> alumnos;
    public static void main(String[] args) {
       Alumno alumno = new Alumno("Pedro", "78657787I", "03/03/1993", notas );
       Alumno alumno2 = new Alumno("Manuel", "78657767G", "03/06/1997", notas );

       alumnos = new ArrayList<>();
       alumnos.add(alumno);
       alumnos.add(alumno2);
       System.out.println("Informacion alumno: "+alumno.toString());
       System.out.println("Buscar por dni: "+Alumno.buscarPorDni(alumno.getDni(), alumnos));
       /** 
       try {
        System.out.println("Edad media alumnos: "+Alumno.edadMediaAlumnos(alumnos));
    } catch (ParseException e) {
        e.printStackTrace();
    }*/
    

    }
}
