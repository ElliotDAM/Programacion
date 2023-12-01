package String;

/**
 * Crea un programa que reemplace todas las ocurrencias de una letra especifica en una cadena de texto.
 * @author ElliotDAM
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "Me estoy haciendo una tarta";
        String letraACambiar = 'a';
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letraACambiar){
                cadena.charAt(i) = 'o';
            }
        }
    }
}
