/**
 * Implementa un programa que calcule el factorial de un numero entero.
 * Utiliza metodos de la clase Integer.
 * @author ElliotDAM
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero = 50;
        int factorial = calcularFactorial(numero);

        System.out.println("El factorial del numero es: "+factorial);
    }

    public static int calcularFactorial(int numero){

        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    
}
