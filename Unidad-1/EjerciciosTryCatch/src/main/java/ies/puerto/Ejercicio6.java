package main.java.ies.puerto;
/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto y luego intente convertirla a un objeto Date.
 * Maneja la excepcion ParseException.
 * @author ElliotDAM
 */

import java.sql.Date;

public class Ejercicio6 {
    

    public static void main(String[] args) {
        solicitarFecha();
        
        try {
            
        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    public static String solicitarFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha con este orden: mes/dia/año:");
        int fechaMal = sc.nextInt();
        return fechaMal;
    }

    public Date fechaADate(){
        int date = "";
        
        return date;
    }
}
