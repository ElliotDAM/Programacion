package ies.puerto.ParteDos.imp;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Aula(){
        this.alumnos = new ArrayList<>();
    }

    public float mediaClase(){
        float resultado = 0;
        int numeroNotas = 0;

        if(alumnos.isEmpty()){
            return resultado;
        }

        for (Alumno alumno : alumnos) {
            for (Nota nota : alumno.getNotas()) {
                resultado += nota.getValor();
                numeroNotas++;
            }
        }

        return resultado / numeroNotas;
    }

    public Aula(String nombre, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Aula [nombre=" + nombre + ", profesor=" + profesor + ", alumnos=" + alumnos + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Aula other = (Aula) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
}
