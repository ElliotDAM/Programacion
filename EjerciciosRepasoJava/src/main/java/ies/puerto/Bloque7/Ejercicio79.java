package main.java.ies.puerto.Bloque7;
/**
 * Escribe un programa que tome un número entero ingresado por el usuario y cuente cuántos dígitos tiene utilizando un bucle for.
 * @author ElliotDAM
 */
public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = sc.nextInt();
        int contador = contadorNumeros(numero);

        System.out.println("El numero "+numero+" tiene "+contador+" digitos.");
    }

    public static int contadorNumeros(int numero){
        String numeroStr = Integer.toString(numero);
        return numeroStr.length();
    }
}
