package ies.puerto.ParteDos.imp;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import ies.puerto.ParteDos.abstracta.PersonaAbstract;

public class Alumno extends PersonaAbstract {
    private List<Nota> notas;

    public Alumno(){
        this.notas = new ArrayList<>();
    }

    public Alumno(String nombre, String dni, String fechaNacimiento, List<Nota> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public static Alumno buscarPorDni(String dni, List<Alumno> alumnos){
        if(alumnos.isEmpty()){
            return null;
        }
        for (Alumno alumno : alumnos) {
            if(alumno.getDni().equals(dni)){
                return alumno;
            }
        }
        return null;
    }

        public static int edadMediaAlumnos(List<Alumno> alumnos) throws ParseException{

        int sumaEdades = 0;
        for (Alumno alumno : alumnos) {
            
            sumaEdades += alumno.anios();
               
        }

        return sumaEdades / alumnos.size();
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno(nombre: "+getNombre()+", dni: "+getDni()+", fecha nacimiento: "+getFechaNacimiento()+", notas: "+getNotas()+")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((notas == null) ? 0 : notas.hashCode());
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
        Alumno other = (Alumno) obj;
        if (notas == null) {
            if (other.notas != null)
                return false;
        } else if (!notas.equals(other.notas))
            return false;
        return true;
    }
}
