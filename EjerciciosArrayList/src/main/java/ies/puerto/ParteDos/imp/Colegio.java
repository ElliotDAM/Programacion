package ies.puerto.ParteDos.imp;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private String nombre;
    private String direccion;
    private String ubicacion;
    private List<Aula> aulas;
    
    public Colegio(){
        this.aulas = new ArrayList<>();
    }
    
    public Colegio(String nombre, String direccion, String ubicacion, List<Aula> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.aulas = aulas;
    }

    public float notaMaxima(){
        float maxima = 0f;

        if(aulas.isEmpty()){
            return 0f;
        }

        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                for (Nota nota : alumno.getNotas()) {
                    if(nota.getValor() > maxima){
                        maxima = nota.getValor();
                    }
                }
            }
        }
        return maxima;
    }

    public float notaMedia(){

        if(aulas.isEmpty()){
            return 0f;
        }

        float suma = 0f;
        int numeroNotas = 0;
            for (Aula aula : aulas) {
                for (Alumno alumno : aula.getAlumnos()) {
                    for (Nota nota : alumno.getNotas()) {
                        suma += nota.getValor();
                        numeroNotas++;

                    }
                }
            }
        return suma / numeroNotas;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public List<Aula> getAulas() {
        return aulas;
    }
    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Colegio [nombre=" + nombre + ", direccion=" + direccion + ", ubicacion=" + ubicacion + ", aulas="
                + aulas + "]";
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
        Colegio other = (Colegio) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
}
