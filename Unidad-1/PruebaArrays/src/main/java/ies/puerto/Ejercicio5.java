package ies.puerto;
//Corregir codigo ya que no esta claro como incrementar la posicion y atribuirla al valor buscado.
/**
 * Clase realizada para buscar un elemento dado dentro de un array
 * @author ElliotDAM
 */

public class Ejercicio5{
    /**
     * Metodo que se utiliza para buscar si existe un valor dentro de un array y su posicion.
     * @param valor que introduce el usuario
     * @return
     */
    public boolean posicionArray(int valor){

        int[] array = {10, 30, 60, 90, 100};
        /*int posicion = -1;

        for (int i = 0; i < array.length ; i++) {
            if (valor == array[i]){
                posicion = i;
                break;
            }
        }*/
        int i = 0;
        int posicion = 0;
        boolean encontrado = false;
        while(i < array.length && !encontrado){
            if (valor == array[i]){
                encontrado = true;
            } else{
                posicion++;
                i++;
            }
        }

        if (!encontrado){
            System.out.println("El valor " + valor + " no se encuentra en el array.");
        }else {
            System.out.println("El valor " + valor + " se encuentra en la posicion " + posicion + " del array.");
        }

        return encontrado;
    }
}