package String;
/**
 * Crea un programa que verifique si una cadena de texto comienza o termina con una subcadena especifica.
 * @author ElliotDAM
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena = "Esto es una frase";
        String subcadena = "frase";
        boolean empiezaCon = cadena.startsWith("Esto");
        boolean terminanCon = cadena.endsWith(subcadena);
    }
}
