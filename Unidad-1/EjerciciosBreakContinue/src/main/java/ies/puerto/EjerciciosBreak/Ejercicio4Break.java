package ies.puerto.EjerciciosBreak;
/**
 * Clase para buscar el primer numero negativo dentro de un array.
 * @author ElliotDAM
 */
public class Ejercicio4Break {

    
    public void buscarNumeroNegativo(){
        int[] array = {1,2,3,-4,5,6};
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                System.out.println("Se ha encontrado el primer numero negativo en el array, el cual es:"+array[i]+".");
                break;
            }
        }
    }
    
}
