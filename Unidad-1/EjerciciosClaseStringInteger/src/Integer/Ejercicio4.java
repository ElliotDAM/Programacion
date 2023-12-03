package Integer;
/**
 * Implementa un programa que calcula y muestre la suma de los digitos de un numero entero.
 * @author ElliotDAAM
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 15;
        String numeroStr = Integer.toString(numero);
        int[] numeros = new int[numeroStr.length()];

        for (int i = 0; i < numeroStr.length(); i++) {
            char caracter = numerostr.charAt(i);
            int n = Character.getNumericValue(caracter);
            numeros[i] = n;
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("La suma de los numeros es: "+suma);

    }

    
}
