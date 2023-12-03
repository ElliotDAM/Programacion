package String;
/**
 * Implementa un programa que convierta una cadena de texto a minusculas y otra a mayusculas.
 * @author ElliotDAM
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        String frase = "Esto es una frase.";
        String fraseMayuscula = fraseAMayuscula(frase);
        String fraseMinuscula = fraseAMinuscula(fraseMayuscula);

    }

    public static String fraseAMinuscula(String frase){
        
        String fraseMinuscula = frase.toLowerCase(frase);
        return fraseMinuscula;
    }

    public static String fraseAMayuscula(String frase){

        String fraseMayuscula = frase.toUpperCase(frase);
        return fraseMayuscula;
    }
}
