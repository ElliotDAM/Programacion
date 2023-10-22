package ies.puerto;
/**
 * Clase creada con el objetivo de determinar si un número dado es primo o no
 * @author ElliotDAM
 */
public class Ejercicio5 {


    /**
     * Función que determina si un número es primo o no
     * @param numero introducido para la comprobación
     * @return booleano si determina que es primo o no
     */
    public boolean numeroPrimo(int numero){

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
          
            }
        }
        return true;
        
    }
}