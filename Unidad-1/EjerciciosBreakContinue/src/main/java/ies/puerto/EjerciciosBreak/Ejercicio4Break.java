package ies.puerto.EjerciciosBreak;
/**
 * 
 */
public class Ejercicio4Break {

    int[] array = {1,2,3,-4,5,6};
    public void buscarNumeroNegativo(){
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                System.out.println("Se ha encontrado el primer numero negativo en el array, el cual es:"+array[i]+".");
                break;
            }
        }
    }
    
}
