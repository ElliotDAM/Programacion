import java.util.Scanner;

/**
 * @author ElliotDAM
 * Ejercicio número 2
 */
public class Ejercicio2 {

    /**
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
     * El algoritmo debe imprimir cual es el mayor y cual es el menor. 
     * Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. 
     * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Algoritmo de comparación de números.");
        System.out.println("En este algoritmo, no se pueden repetir los números que ha seleccionado.");
            System.out.println("Indique el primer número que desea comparar");
            int A = sc.nextInt();
            System.out.println("Indique el segundo número");
            int B = sc.nextInt();
            if (A == B){
                System.out.println("Hay algunos numeros iguales, pruebe de nuevo.");
                return;
            }
            System.out.println("Indique un tercer número");
            int C = sc.nextInt();
            if ((C == A)||(C == B) ){
                System.out.println("El tercer número se repite. Inténtelo de nuevo.");
                return;
            }else {
                int mayor = A;
            if (B > mayor){
                mayor = B;
            }
            if (C > mayor) {
                mayor = C;
            }
            System.out.println("El número mayor es: "+ mayor);
            }
        
            int menor = A;
            if(B < menor){
                menor = B;
            }
            if (C < menor){
                menor = C;
            }
            System.out.println("El número menor es: "+menor);
    }
}