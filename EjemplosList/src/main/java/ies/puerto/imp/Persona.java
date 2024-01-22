package ies.puerto.imp;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    String dni;
    String nombre;
    String apellido1;
    String apellido2;

    List<Double> calificaciones;

    public Persona(String dni, String nombre, String apellido1, String apellido2, List<Double> calificaciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        //this.calificaciones = calificaciones;
        calificaciones = new ArrayList<>();
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public double media(){
        
        Double resultado = 0d;
        Double suma = 0d;
        if(calificaciones.isEmpty()){
            return resultado;
        }
        for (Double nota : calificaciones) {
            suma += nota;
        }
        resultado = suma / calificaciones.size();
        return resultado;

    }

    @Override
    public String toString(){
        return "Dni: "+dni+", Nombre: "+nombre+", Apellido1: "+apellido1+", Apellido2: "+apellido2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    
    
}
