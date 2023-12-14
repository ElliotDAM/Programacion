
/**
 * Desarrollar un programa que compare dos fechas utilizando la clase Date y muestre si son iguales o diferentes.
 * @author ElliotDAM
 */
public class Evento {
    public static void main(String[] args){

        Date fecha1 = new Date();
        Date fecha2 = new Date();

        boolean fechasIguales = fecha1.equals(fecha2);

        if (fechasIguales){
            System.out.println("Las fechas son iguales.");
        }else{
            System.out.println("Las fechas son distintas.");
        }
    }
}
