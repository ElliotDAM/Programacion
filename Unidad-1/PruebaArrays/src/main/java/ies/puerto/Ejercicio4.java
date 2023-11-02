package ies.puerto;
//En este codigo falta eliminar los 0 sobrantes del arrayPares. Hay que hacer un bucle primero para
//contar el numero de posiciones que se necesita reservar para el array de pares, y luego rellenarla con esos pares en otro bucle.
/**
 * Clase dedicada a la localizacion de los numeros pares dentro de un Array
 * @author ElliotDAM
 */
public class Ejercicio4{


    public static void main(String[] args) {
        int[] array = {15,30,45,60,75};
        int[] resultado = mostrarNumerosPares(array);
    }
    /**
     * Metodo que se utiliza para localizar los numeros pares dentro de un array.
     * @return array de numeros pares
     */
    public static int[] calcularNumerosPares(){

        int[] array = {15, 30, 45, 60, 75};
        int[] arrayPares = new int[array.length];
        int posiciones = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                arrayPares[posiciones] = array[i];
                posiciones++;
            }
        }
        
        return arrayPares;
    }

    /**
     * Metodo para mostrar los numeros pares calculados anteriormente.
     *
     * @return
     */
    public static int[] mostrarNumerosPares(int[] array){

        int[] numerosPares = calcularNumerosPares();
        for (int i = 0; i < numerosPares.length; i++) {
             System.out.println(numerosPares[i]);
        }


        return numerosPares;
    }
}