package ies.puerto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;

public class Persona {
    
    private String nombre;
    private String fechaNacimiento;

    public Persona(){}

    public Persona(String nombre, String fechaNacimiento){
        
        SimpleDateFormat fechaNacimientoDate = new SimpleDateFormat(fechaNacimiento);
        
        
        try {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
        } catch (InputMismatchException e) {
            System.out.println("El tipo de dato no es el correcto.");
        }        
    }

    public int calcularEdad(String fechaNacimiento){

        SimpleDateFormat fechaNacimientoDate = new SimpleDateFormat(fechaNacimiento);
        Calendar fechaNacimientoCal = new Calendar(fechaNacimientoDate);
        Calendar fechaActual = Calendar.getInstance();
        
        int diferenciaDias = fechaActual.setTime(fechaActual) - fechaNacimiento.setTime;
        
        return 0;

        /*int diferenciaFecha = fechaActual - fechaNacimiento;

        return diferenciaFechas;
*/


        
    }

    /**
     * @param fechaNacimiento
     * @param fechaInicio
     * @param fechaFinal
     * @return
     */
    public String obtenerSignoZodiacal(String fechaNacimiento, String fechaInicio, String fechaFinal){
        
        SimpleDateFormat fechaNacDate = new SimpleDateFormat(fechaNacimiento);
        SimpleDateFormat fechaInicDate = new SimpleDateFormat(fechaInicio);
        SimpleDateFormat fechaFinalDate = new SimpleDateFormat(fechaFinal);

        switch (fechaNacDate) {
            case ("Aries"):

                break;
        
            default:
                break;
        }

        return "";

    }

    public String informacion(){

    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        String nombre = "Elliot";
        String fecha = "12/10/1994";

        persona(nombre, fecha);
    }
    
}
