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
<<<<<<< HEAD
        int resultado;
=======
        int resultado = 0;
>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938

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
<<<<<<< HEAD
}
=======

>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938
