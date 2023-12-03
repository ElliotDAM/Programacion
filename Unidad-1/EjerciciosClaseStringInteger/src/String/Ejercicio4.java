package String;
/**
 * Implementa un programa que invierta una cadena de texto dada.
 * @author ElliotDAM
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        String cadena = "Hola mundo";
        String copiaCadena = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            copiaCadena += cadena.charAt(i);
            
        }
        System.out.println("La cadena invertida es: "+copiaCadena);
    }
}
