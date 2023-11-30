import java.util.Calendar;

/**
 * Desarrollar un programa que verifique si la fecha actual es un sabado o domingo utilizando la clase Calendar y muestre un mensaje apropiado.
 * @author ElliotDAM
 */
public class Ejercicio10 {
    public static void main(String[] args) {
    
    Calendar calendar = Calendar.getInstance();

    int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

    if(diaSemana == Calendar.SATURDAY || diaSemana == Calendar.SUNDAY){
        System.out.println("El dia es fin de semana.");
    }else{
        System.out.println("Es dia entre semana.");
    }
    }
    
   
}
