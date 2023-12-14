
import java.util.Scanner;
/**
 * Implementa un programa que invierta una cadena de texto dada. La cadena debe de tener al menos 10 caracteres no vacíos.
 * @author ElliotDAM
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String frase = sc.nextLine();
        String fraseInvertida = invertirTexto(frase);
        System.out.println("Su frase invertida es: "+fraseInvertida);
    }

    public static String invertirTexto(String texto){
        
        char[] cadena = texto.toCharArray();
        String cadenaInvertida = "";
        for(int i = texto.length() - 1; i >= 0; i--){
            cadenaInvertida = cadenaInvertida + cadena[i];
        }
        return cadenaInvertida;
    }
}
