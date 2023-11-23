package ies.puerto.EjerciciosBreak;

public class Ejercicio3Break {
    
    public void encontrarNumero7(){

        int[] array = {1,2,3,4,5,6,7};

        for (int i = 0; i < array.length; i++) {
            int numeroBuscado = 7;
            if(array[i] == numeroBuscado){
                System.out.println("Se ha encontrado el numero 7 en la posicion:"+i+" del array.");
                break;
            }
        }
    }
}
