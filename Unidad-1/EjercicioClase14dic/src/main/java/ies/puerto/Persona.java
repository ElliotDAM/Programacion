package ies.puerto;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
    
    private String nombre;
    private String fechaNacimiento;

    public Persona(){}

    public Persona(String nombre, String fechaNacimiento) throws ParseException{
        
        
        
        try {
            this.nombre = nombre;
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.parse(fechaNacimiento);
            this.fechaNacimiento = fechaNacimiento;
        } catch (ParseException e) {
            System.out.println("El tipo de dato no es el correcto.");
        }        
    }

    public int calcularEdad(String fechaNacimiento){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try{
            Date fechaNacimientoDate = formatoFecha.parse(fechaNacimiento);
            Calendar fechaNacimientoCal = Calendar.getInstance();
            fechaNacimientoCal.setTime(fechaNacimientoDate);
            Calendar fechaActual = Calendar.getInstance();
            
            int diferenciaAnios = fechaActual.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

            if(fechaActual.get(Calendar.MONTH) < fechaNacimientoCal.get(Calendar.MONTH) ||
            (fechaActual.get(Calendar.MONTH) == fechaNacimientoCal.get(Calendar.MONTH) &&
             fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNacimientoCal.get(Calendar.DAY_OF_MONTH))){
            diferenciaAnios--;
            }
            return diferenciaAnios;
        }catch(ParseException e){
            System.out.println("Formato de fecha incorrecto.");
            return -1;
        }
        

        
    }

    /**
     * @param fechaNacimiento
     * @return
     * @throws ParseException
     */
    public String obtenerSignoZodiacal(String fechaNacimiento) throws ParseException{
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacDate = formatoFecha.parse(fechaNacimiento);
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaNacDate);
        int mes = fechaNacimientoCal.get(Calendar.MONTH) + 1;
        int dia = fechaNacimientoCal.get(Calendar.DAY_OF_MONTH);
        String signo = "";

        switch (mes) {
            case 1:
                    if(dia <= 20){
                       signo = "Capricornio";
                    }else if (dia > 20){
                        signo = "Acuario";
                    }
                break;
            case 2:
                    if(dia < 20){
                        signo = "Acuario";
                    }else if (dia >= 20){
                        signo = "Piscis";
                    }
                    break;
            case 3:
                    if(dia <= 20){
                        signo = "Piscis";
                    }else if (dia > 20){
                        signo = "Aries";
                    }
                    break;
            case 4:
                    if(dia <= 20){
                        signo = "Aries";
                    }else if (dia > 20){
                        signo = "Tauro";
                    }
                    break;
             case 5:
                    if(dia <= 21){
                        signo = "Tauro";
                    }else if (dia > 21){
                        signo = "Geminis";
                    }
                    break;
             case 6:
                    if(dia <= 21){
                        signo = "Geminis";
                    }else if (dia > 21){
                        signo = "Cancer";
                    }
                    break;
             case 7:
                    if(dia <= 22){
                        signo = "Cancer";
                    }else if (dia > 22){
                        signo = "Leo";
                    }
                    break;
            case 8:
                    if(dia <= 23){
                        signo = "Leo";
                    }else if (dia > 23){
                        signo = "Virgo";
                    }
                    break;
             case 9:
                    if(dia <= 22){
                        signo = "Virgo";
                    }else if (dia > 22){
                        signo = "Libra";
                    }
                    break;
             case 10:
                    if(dia <= 22){
                        signo = "Libra";
                    }else if (dia > 22){
                        signo = "Escorpio";
                    }
                    break;
             case 11:
                    if(dia <= 21){
                        signo = "Escorpio";
                    }else if (dia > 21){
                        signo = "Sagitario";
                    }
                    break;
             case 12:
                    if(dia <= 21){
                        signo = "Sagitario";
                    }else if (dia > 21){
                        signo = "Capricornio";
                    }
                    break;
            default:
                    signo = "No se ha añadido un mes correcto. Revise su fecha.";
                break;
        }

        return signo;
       

    }

    public String informacion() throws ParseException{
        int edad = calcularEdad(this.fechaNacimiento);
        String signoZodiacal = obtenerSignoZodiacal(this.fechaNacimiento);

        return "Nombre: "+this.nombre +", Fecha nacimiento: "+this.fechaNacimiento+", Edad: "+edad+", Signo Zodiacal: "+signoZodiacal;
    }

    public static void main(String[] args) throws ParseException {
        
        String nombre = "Elliot";
        String fecha = "12/10/1994";
        Persona persona = new Persona(nombre, fecha);
        System.out.println("Informacion: "+persona.informacion());
        
    }
    
}
