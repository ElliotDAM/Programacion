package String;

/**
 * Crea un programa que reemplace todas las ocurrencias de una letra especifica en una cadena de texto.
 * @author ElliotDAM
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "Me estoy haciendo una tarta";
        char letraACambiar = 'a';
        char letraNueva = 'o';
        char[] letras = cadena.toCharArray();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (letras[i] == letraACambiar){
                letras[i] = letraNueva;
            }
        }

        String nuevaCadena = new String(letras);
        System.out.println("Nueva cadena con modificacion: "+nuevaCadena);
    }
}
