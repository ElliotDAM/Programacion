package ies.puerto;
public class Ejercicio5{

    public int[][] crearMatriz(){

        int[][] matriz = new int[5][5];
        int tamanio = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamanio ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
               if(i == j){
                   matriz[i][j] = 1;
               }
            }
        }

        /*for (int i = 0; i < matriz.length ; i++) {
            matriz[i][i] = 1;
        }*/

    }
}