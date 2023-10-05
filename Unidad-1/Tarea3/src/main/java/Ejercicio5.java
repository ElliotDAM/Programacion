import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.
     * @param args
     */
    
     public static void main(String[] args) {
      //Declaramos variables a utilizar
        int numUsuario;
        int primerNumero = 0;
        int segundoNumero = 1;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la posicion que desea en la secuencia de Fibonacci");
        numUsuario = sc.nextInt();
      //Iteramos hasta la posicion del usuario
        for (int i = 1; i < numUsuario; i++) {
         //Sustituimos la variable resultado cada vez que itera el bucle
           resultado = primerNumero + segundoNumero;
           System.out.println(resultado + " ");
           primerNumero = segundoNumero;
           segundoNumero = resultado;
        }
        
        System.out.println("El número de Fibonacci en la posicion " + numUsuario + " es: " + resultado);
     }
}

