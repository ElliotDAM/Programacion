package ies.puerto.ParteDos.abstracta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public abstract class PersonaAbstract {
    private String nombre;
    private String dni;
    private static String fechaNacimiento;
    
    public PersonaAbstract(){}
    
    public PersonaAbstract(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int anios() throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimientoDate = formato.parse(fechaNacimiento);
        Calendar fechaNacimientoCalendar = Calendar.getInstance();
        fechaNacimientoCalendar.setTime(fechaNacimientoDate);

        Calendar fechaActual = Calendar.getInstance();

        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimientoCalendar.get(Calendar.YEAR);
        if(fechaActual.before(fechaNacimientoCalendar)){
            edad --;
        }
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "PersonaAbstract [nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + "]";
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
        PersonaAbstract other = (PersonaAbstract) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }
}
