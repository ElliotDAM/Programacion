package String;
/**
 * Escribe un programa que compare dos cadenas de texto e indique si son iguales o diferentes.
 * @author ElliotDAM
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        String cadena1 = "Unforgiven";
        String cadena2 = "Nothing else matters";

        boolean esIgual = cadena1.equals(cadena2);

        if(esIgual){
            System.out.println("Las cadenas son iguales.");
        }else{
            System.out.println("Las cadenas son diferentes.");
        }
    }
}
