package ies.puerto.ParteDos.imp;

import java.text.ParseException;
import java.util.List;

import ies.puerto.ParteDos.abstracta.EmpleadoAbstract;


public class Profesor extends EmpleadoAbstract {
    private String especialidad;

    public Profesor(String nombre, String dni, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, dni, fechaNacimiento, salario);
        this.especialidad = especialidad;
        
    }

    public static float salarioMedio(List<Profesor> profesores){
        
        if(profesores.isEmpty()){
            return 0f;
        }

        float suma = 0;

        for (Profesor profesor : profesores) {
            suma += profesor.getSalario();
        }
        return suma / profesores.size();
    }

    public static float salarioMaximo(List<Profesor> profesores){
        if(profesores.isEmpty()){
            return 0f;
        }
        float salarioMaximo = 0f;

        for (Profesor profesor : profesores) {
            if(salarioMaximo < profesor.getSalario()){
                salarioMaximo = profesor.getSalario();
            }
        }
        return salarioMaximo;

    }

    public static float salarioMinimo(List<Profesor> profesores){
        if(profesores.isEmpty()){
            return 0f;
        }
        float salarioMinimo = 0f;

        for (Profesor profesor : profesores) {
            if(salarioMinimo > profesor.getSalario()){
                salarioMinimo = profesor.getSalario();
            }
        }
        return salarioMinimo;

    }

    public static Profesor buscarPorDni(String dni, List<Profesor> profesores){
        
        if(profesores.isEmpty()){
            return null;
        }

        for (Profesor profesor : profesores) {
            if(profesor.getDni().equals(dni)){
                return profesor;
            }
        }
        return null;
    }

    public static int edadMediaProfesores(List<Profesor> profesores) throws ParseException{

        int sumaEdades = 0;
        for (Profesor profesor : profesores) {
            
            sumaEdades += profesor.anios();
               
        }

        return sumaEdades / profesores.size();
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor(nombre: "+getNombre()+", dni: "+getDni()+", fecha nacimiento: "+getFechaNacimiento()+", salario: "+getSalario()+", especialidad: "+getEspecialidad()+")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Profesor other = (Profesor) obj;
        if (especialidad == null) {
            if (other.especialidad != null)
                return false;
        } else if (!especialidad.equals(other.especialidad))
            return false;
        return true;
    }

    
}
