package ies.puerto.Bloque3;
import java.util.Scanner;
/**
 * Escribe un programa que utilice una variable booleana para determinar si un número ingresado por el usuario es par o impar.
 * @author ElliotDAM
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPar = false;
        System.out.println("Ingrese un numero para comprobar si es par");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            esPar = true;
        }
        if(esPar){
            System.out.println("Su numero es par");
        }else{
            System.out.println("Su numero es impar");
        }
    }
}
