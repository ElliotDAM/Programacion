package ies.puerto.ParteDos.abstracta;
public abstract class TrabajadorAbstract extends PersonaAbstract {
    private float salario;

    public TrabajadorAbstract(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(salario);
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
        TrabajadorAbstract other = (TrabajadorAbstract) obj;
        if (Float.floatToIntBits(salario) != Float.floatToIntBits(other.salario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Trabajador(nombre: "+ getNombre()+", dni: "+ getDni()+", fecha nacimiento: "+getFechaNacimiento()+", salario: "+salario+")";
    }
}
