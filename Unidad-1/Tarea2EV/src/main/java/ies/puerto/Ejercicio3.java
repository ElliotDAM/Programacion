
import java.util.Scanner;

/**
 * Implementa un programa que calcule y muestre la suma de los dígitos de un número entero. 
 * @author ElliotDAM
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero:");
        int numero = sc.nextInt();
        int suma = sumaDigitos(numero);

        System.out.println("La suma de los numeros por separado de "+numero+" es:"+suma);
    }

    public static int sumaDigitos(int numero){
        Integer valorInteger = Integer.valueOf(numero);
        String valorString = valorInteger.toString();
        char[] numeroChar = valorString.toCharArray();
        int suma = 0;
        
        for(int i = 0; i < numeroChar.length; i++){
            int digito = Character.getNumericValue(numeroChar[i]);
            suma = suma + digito;
        }
        return suma;
    }
}
