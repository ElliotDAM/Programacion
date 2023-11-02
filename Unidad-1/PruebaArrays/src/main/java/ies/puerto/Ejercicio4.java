package ies.puerto;

/**
 * Clase dedicada a la localizacion de los numeros pares dentro de un Array
 * @author ElliotDAM
 */
public class Ejercicio4{
    /**
     * Metodo que se utiliza para localizar los numeros pares dentro de un array.
     * @return array de numeros pares
     */
    public int[] calcularNumerosPares(){

        int[] array = {15, 30, 45, 60, 75};
        int[] arrayPares = new int[array.length];
        int posiciones = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                arrayPares[posiciones] = array[i];
            }
        }
        
        return arrayPares;
    }

    /**
     * Metodo para mostrar los numeros pares calculados anteriormente.
     */
    public void mostrarNumerosPares(){

        int[] numerosPares = calcularNumerosPares();
        for (int i = 0; i < numerosPares.length; i++) {
             System.out.println(numerosPares[i]);
        }
       

    }
}