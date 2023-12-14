import java.util.Scanner;
/**
 * Desarrolla un programa que cuente el numero de vocales en una cadena de texto.
 * @author ElliotDAM
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase y le mostrare cuantas vocales tiene:");
        String frase = sc.nextLine();
        int conteoVocal = contarVocales(frase);
        System.out.println("Su frase tiene "+conteoVocal+" vocales.");
    }

    public static int contarVocales(String texto){
        char[] letras = texto.toCharArray();
        int contador = 0;
        for(int i = 0; i <= letras.length; i++){
            if(letras[i] == 'a'||letras[i] == 'e'||letras[i] == 'i'||letras[i] == 'o'||letras[i] == 'u'){
                contador++;
            }
        }

        return contador;
    }
}
