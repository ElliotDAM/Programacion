/**
 * Desarrolla un programa que convierta un numero entero a su representacion binaria.
 * Utiliza metodos de la clase Integer.
 * @author ElliotDAM
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        int numero = 50;

        String binario = conversionBinario(numero);

        System.out.println("El numero en binario es: "+binario);
    }

    public static String conversionBinario(int numero){
        return Integer.toBinaryString(numero);
    }
}
