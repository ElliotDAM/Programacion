package String;
/**
 * Desarrolla un programa que elimine los espacios en blanco al principio y al final de una cadena de texto.
 * @author ElliotDAM
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        String frase = "      Esto es una frase.     ";
        String fraseSinEspacios = eliminaEspacios(frase);
        System.out.println("Su frase sin espacios: "+fraseSinEspacios);
    }
    
    public static String eliminaEspacios(String frase){
        
        String fraseSinEspacios = frase.trim();
        
        return fraseSinEspacios;
    }
}
