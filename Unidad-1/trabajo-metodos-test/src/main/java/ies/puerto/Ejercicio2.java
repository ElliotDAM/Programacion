package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio2 {
    public static void main(String[] args) {

    }

    /**
     * Función que calcula el mcd de dos números dados.
     * @param numero1 para el cálculo
     * @param numero2 para el cálculo
     * @return mcd de los números dados
     */
    public int mcd(int numero1, int numero2) {
        int resultado = 0;
        boolean encontrado = false;
        int mayor = numero2;

        if( numero1 > numero2 ) {
            mayor = numero1;
        }

        int i = mayor / 2;
        while(encontrado == false && i > 0){
            if ( ( numero1 % i == 0 ) && ( numero2 % i == 0 ) ){
                encontrado = true;
                resultado = i;
            }
            i--;
        }

        return resultado;
    }

}