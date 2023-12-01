package Integer;
/**
 * Desarrolla un programa que determine si un numero entero es primo o no utilizando los metodos de la clase Integer.
 * @author ElliotDAM
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
    }

    public static boolean esPrimo(int numero){
        if(numero % 1 == 0 && numero % numero == 0 ){
            return true;
        }
        return false;
    }
}
