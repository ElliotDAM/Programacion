
import java.util.Scanner;

/**
 * author ElliotDAM
 */
public class Ejercicio3 {
    /**
     * 3. Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
     * @param args
     */
    
     public static void main(String[] args) {
      //Declaramos variables a utilizar
        int numUsuario;
        int primerNumero = 0;
        int segundoNumero = 1;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la posiciton que desea en la secuencia de Fibonacci");
        numUsuario = sc.nextInt();
      //Iteramos hasta la posicion del usuario
        for (int i = 1; i < numUsuario; i++) {
         //Sustituimos la variable resultado cada vez que itera el bucle
           resultado = primerNumero + segundoNumero;
           primerNumero = segundoNumero;
           segundoNumero = resultado;
        }
        
        System.out.println("El número de Fibonacci en la posicion " + numUsuario + " es: " + resultado);
     }
}
