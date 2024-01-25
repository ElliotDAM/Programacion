package main.java.ies.puerto;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Float> calificaciones;


    public Alumno(String nombre, String apellido, ArrayList<Float> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }

    public float calcularPromedio(){
        
        float suma = 0;
        float promedio = suma / calificaciones.size();

        for (float calificacion : calificaciones) {
            suma += calificacion;
            
        }
        return promedio;
        
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", calificaciones=" + calificaciones + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
