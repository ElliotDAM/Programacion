import java.util.Scanner;

/**
 * author ElliotDAM
 */
public class Ejercicio9 {
    /**
     * Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.
     * @param args
     */
   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        System.out.println("Dame el número del que quieres saber la tabla");
        int numero = sc.nextInt();
        for (int i = 1; i < 10 ; i++) {
            int multiplicacion = numero * i;
            System.out.println(multiplicacion);            
        }
     }
}
