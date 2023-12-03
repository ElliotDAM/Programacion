package Integer;
/**
 * Desarrolla un programa que determine si un numero entero es primo o no utilizando los metodos de la clase Integer.
 * @author ElliotDAM
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 10;

        if(esPrimo(numero)){
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo");
        }
    }

    public static boolean esPrimo(int numero){

        if(numero <= 1){
            System.out.println("Debes ingresar un numero positivo.");
            return false;
        }

        for (int i = 2; i <= numero; i++) {
            if(numero % i == 0){
                return false;
            }
        }
        return true;

        
        return false;
    }
}
