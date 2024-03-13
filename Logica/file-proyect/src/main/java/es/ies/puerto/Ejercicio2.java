package es.ies.puerto;
/**
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Ejercicio2 {

    public void main(String[] args) {
        
        for (int i = 1; i < 100; i++) {
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }

    private boolean esPrimo(int numero){

        for (int i = 2; i < numero; i++) {
            if(numero % 1 == 0){
                return false;
            }
        }
        return true;
    }
}
