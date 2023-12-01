import java.util.Calendar;


/**
 * Implementar un programa que sume 10 dias a la fecha actual utilizando la clase Calendar.
 * @author ElliotDAM
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_MONTH, 10);
        
        
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        

        System.out.println("La fecha con diez dias mas es: " + año + "-" + mes + "-" + dia);
    }
}
