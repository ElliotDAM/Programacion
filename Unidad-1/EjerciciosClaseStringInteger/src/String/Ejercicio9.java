package String;
/**
 * Crea un programa que verifique si una cadena de texto comienza o termina con una subcadena especifica.
 * @author ElliotDAM
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena = "Esto es una frase";
        String inicioCadena = "Esto";
        String finalCadena = "frase";
        boolean empiezaCon = cadena.startsWith(inicioCadena);
        boolean terminanCon = cadena.endsWith(finalCadena);

        System.out.println("La cadena comienza con 'Esto': "+empiezaCon);
        System.out.println("La cadena termina con 'frase': "+terminanCon);
    }
}
