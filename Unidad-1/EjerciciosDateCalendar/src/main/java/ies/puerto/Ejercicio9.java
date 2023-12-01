import java.util.Calendar;

/**
 * Crear un programa que obtenga y muestre el primer dia del mes actual utilizando la clase Calendar.
 * @author ElliotDAM
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) +1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("El primer dia de este mes es: "+anio+"-"+mes+"-"+dia);

    }
}
