package ies.puerto;
/**
 * Escribir un programa que utilice la clase Calendar para obtener y mostrar la fecha actual con los componentes separados(anio, mes, dia)
 * @author ElliotDAM
 */
public class Ejercicio3 {
    public static void main(String[] args){

        Calendar calendar = get.Instance();
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH)+1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        Sistem.out.println("Fecha actual: "+año+"-"+mes+"-"+dia);
    }
}
