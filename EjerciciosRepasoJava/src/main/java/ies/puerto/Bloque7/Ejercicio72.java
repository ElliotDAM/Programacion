package main.java.ies.puerto.Bloque7;
/**
 * Escribe un programa que solicite al usuario ingresar cinco números y calcule el producto de esos números utilizando un bucle for.
 * @author ElliotDAM
 */
public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicacion = 1;
        for (int i = 1; i <= 5; i++) {
        System.out.println("Ingrese el "+i+" numero");
        int numero = sc.nextInt();
        multiplicacion = multiplicacion * numero;
       }
       System.out.println("El resultado de multiplicar los 5 numeros es: "+multiplicacion); 
    }
}
