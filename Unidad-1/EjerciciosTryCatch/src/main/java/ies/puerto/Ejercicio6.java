package main.java.ies.puerto;
/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto y luego intente convertirla a un objeto Date.
 * Maneja la excepcion ParseException.
 * @author ElliotDAM
 */
import java.util.Scanner;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ejercicio6 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha con este orden: mes/dia/año:");
        String fechaAString = sc.nextLine();
        
        Date fecha = fechaADate(fechaAString);
    
    }


    public static Date fechaADate(String fechaString){
        Date fecha = null;
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        
        try {
            fecha = formato.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Estoy capturando una excepcion porque la fecha es incorrecta.");
        }
        return fecha;
    }
}
