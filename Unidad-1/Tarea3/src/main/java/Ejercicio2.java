import java.util.Scanner;

/**
 * author ElliotDAM
 */
public class Ejercicio2 {
    /**
     * Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
<<<<<<< HEAD
        int mcd;
=======
        int mcd =0;
>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938

        //Pedir números al usuario

        System.out.println("Cálculo del MCD de dos números");
        System.out.println("Dame el primer número a calcular");
        numero1 = sc.nextInt();
        System.out.println("Dame el segundo número a calcular");
        numero2 = sc.nextInt();

        //Iteramos en el bucle para encontrar el divisor que coincide entre ellos

        for (int i = 1; i <= numero1 && i <= numero2; i++) {
            //Se comprueba si es un divisor valido para los dos numeros
            if (numero1 % i == 0 && numero2 % i == 0){
                mcd = i;
            }
            
        }
        //
        System.out.println("El maximo comun divisor de los dos números es: " + mcd);
    }
}
