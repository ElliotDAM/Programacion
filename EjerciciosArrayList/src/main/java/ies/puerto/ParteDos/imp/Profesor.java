package ies.puerto.ParteDos.imp;

import ies.puerto.ParteDos.abstracta.EmpleadoAbstract;

public class Profesor extends EmpleadoAbstract {
    private String especialidad;

    public Profesor(String nombre, String dni, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, dni, fechaNacimiento, salario);
        this.especialidad = especialidad;
        
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
