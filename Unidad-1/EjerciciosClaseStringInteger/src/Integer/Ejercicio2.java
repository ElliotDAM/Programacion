package Integer;
/**
 * Escribe un programa que convierta un numero entero en una cadena de texto y viceversa utilizando los metodos de la clase Integer.
 * @author ElliotDAM
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String numeroStr = "55";
        int numero = 42;
        System.out.println(enteroAString(numero));
        System.out.println(stringAEntero(numeroStr));
    }
   
    public static String enteroAString(Integer numero){
        String numeroStr = numero.toString();
        return numeroStr;
        
    }

    public static int stringAEntero(String palabra){
        int numero = Integer.parseInt(palabra);
        return numero;
    }
}
