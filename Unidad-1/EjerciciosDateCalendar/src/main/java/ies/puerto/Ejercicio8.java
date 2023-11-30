import java.text.SimpleDateFormat;

/**
 * Implementar un programa que parsee una cadena en formato "dd-MM-yyyy" a un objeto Date utilizando SimpleDateFormat
 * @author ElliotDAM
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String fecha = "10/10/2023";
        String patron = "dd-MM-yyyy";

        SimpleDateFormat format = new SimpleDateFormat(patron);

        Date fechaParse = format.parse(fecha);

        System.out.println("La fecha parseada es:"+fechaParse);
    }
}
