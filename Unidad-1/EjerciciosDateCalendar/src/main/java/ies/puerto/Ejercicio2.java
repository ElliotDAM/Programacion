package ies.puerto;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Desarrollar un programa que formatee la fecha actual en el formato "dd-MM-yyyy HH:mm:ss" utilizando la clase SimpleDateFormat de DateFormat.
 * @author ElliotDAM
 */
public class Persona {
    
    public static void main(String[] args){

        Date fecha = new Date();

        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        String fechaFormateada = formatoFecha.format(fecha);

        System.out.println("Fecha formateada: "+fechaFormateada);
    }
}
