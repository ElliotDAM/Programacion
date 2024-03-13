package es.ies.puerto;
/**
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String palabra = "Benavente";
        String palabraInvertida = invertirPalabra(palabra);
        System.out.println(palabraInvertida);
    }

    public static String invertirPalabra(String palabra){
        palabra = palabra.toLowerCase();
        char[] palabraArray = palabra.toCharArray();
        char[] palabraInvertidaArray = new char[palabraArray.length];

        for (int i = 0; i <= palabra.length() - 1; i++) {
            palabraInvertidaArray[i] = palabraArray[palabra.length() - 1 - i];
        }
        
        return new String (palabraInvertidaArray);
        
    }
}
