package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Metodo para pedir las notas al usuario
     */
    public void pedirNotas(){
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int temporal;
        boolean salir = false;
        do {
            System.out.println("Introduzca el valor" + (i + 1));
            temporal = sc.nextInt();

            if(temporal < 0){
               salir = true;
            } else {
               array[i] = temporal;
               i++;
            }
        }while(i < array.length && !salir);

        mostrarArray(array, i);
    }

    /**
     * Metodo para mostrar el array dado.
     * @param notas
     */
    public void mostrarArray(int[] notas, int total){

        for (int i = 0; i <= total; i++) {
            System.out.println(notas[i] + ",");
        }
    }
}