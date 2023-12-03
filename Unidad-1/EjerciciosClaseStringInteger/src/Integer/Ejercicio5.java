package Integer;

import java.util.Scanner;

/**
 * Crea un programa que tome dos numeros enteros como entrada y muestre el maximo comun divisor.
 * Usa metodos de la clase Integer.
 * @author ElliotDAM
 */
public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese otro numero:");
        int numero2 = sc.nextInt();

        int mcd = maximoComunDivisor(numero1, numero2);

        System.out.println("El maximo comun divisor de los numeros dados es: "+mcd);

    }
/**
 * Calcula el maximo comun divisor de dos numeros dados.
 * @param numero1
 * @param numero2
 * @return maximo comun divisor de numero1 y numero2
 */
    public static int maximoComunDivisor(int numero1, int numero2){
        while (numero2 != 0){
            int aux = numero2;
            numero2 = numero1 % numero2;
            numero1 = aux;
        }
        return numero1;
    }
}