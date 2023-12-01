package String;
/**
 * Implementa un programa que invierta una cadena de texto dada.
 * @author ElliotDAM
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        String cadena = "Hola mundo";
        String copiaCadena = "";

        for (int i = cadena.length(); i < cadena.charAt(0); i++) {
            copiaCadena = i;
            System.out.println(copiaCadena);
        }
    }
}
