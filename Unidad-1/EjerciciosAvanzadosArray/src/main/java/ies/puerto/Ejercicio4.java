package ies.puerto;

import java.util.Scanner;

public class Ejercicio4{

    public int[][] crearMatriz(){

        int[][] matriz = new int[5][5];
        int tamanio = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamanio ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.println();
                matriz = sc.nextInt();
            }
        }

    }

    public void suma(int[][] matriz){
        int sumaFila = 0;
        int sumaColumna = 0;
        for (int i = 0; i < matriz.length ; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length ; j++) {
                sumaFila = sumaFila + matriz[i][j];
                sumaColumna = sumaColumna + matriz[j][i];

            }
            System.out.println("Valor de la fila:"+(i+1)+"="+sumaFila);
            System.out.println("Valor de la columna:"+(i+1)+"="+sumaColumna);
        }
    }


}