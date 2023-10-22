<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938
/**
 * author ElliotDAM
 */
public class Ejercicio4 {
    /**
<<<<<<< HEAD
     * @param args
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número que desea comprobar");
        int numeroUsuario = sc.nextInt();

        String numeroString = String.valueOf(numero);
=======
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el numero que desea comprobar");
        int numeroUsuario = sc.nextInt();
        int numero = numeroUsuario;

        for (int i = 0; i < args.length; i++) {
            
        }
/**
 *    String numeroString = String.valueOf(numeroUsuario);
        int longitud = numeroString.length();

        for (int i = 0; i < longitud - 1; i++) {
            int posicionFinal = longitud;
            int posicion =numeroString.charAt(i);
            if (posicion == posicionFinal){
                System.out.println("Comprobando que el numero es palíndromo");
              posicionFinal--;
            }
        }
 */

     
>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938


    }
}
