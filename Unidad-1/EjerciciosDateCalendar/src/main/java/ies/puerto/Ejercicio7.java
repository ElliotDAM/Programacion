import java.util.Calendar;

/**
 * Escribir un programa que calcule la diferencia en dias entre dos fechas utilizando la clase Calendar.
 * @author ElliotDAM
 */
public class Ejercicio7 {
    
    public static void main(String[] args){

        Calendar fecha1 = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();

        fecha1.set(2023, Calendar.MARCH, 15);
        fecha2.set(2023, Calendar.APRIL, 8);

        long milisegundos1 = fecha1.getTimeInMillis();
        long milisegundos2 = fecha2.getTimeInMillis();

        long diferenciaMilis = milisegundos1 - milisegundos2;
        int diferenciaDias = (int) (diferenciaMilis / (1000*60*60*24));
        
        System.out.println("La diferencia en dias entre las dos fechas es de: "+diferenciaDias);
    }


    /*public static void main(String[] args) {
       int resta = 0;
    Calendar fecha1 = Calendar.getInstance();
    Calendar fecha2 = Calendar.getInstance();
        
    if(fecha1 < fecha2){
        resta = fecha2 - fecha1;
    }else{
        resta = fecha1 - fecha2;
    }

    Para hacerlo sin los ifs, realizar:

    Math.abs(fecha1 - fecha2);

    Con las fechas declaradas en milisegundos.
    }*/
}
