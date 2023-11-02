package ies.puerto;

public class Ejercicio6{

    public static void main(String[] args) {

        Ejercicio6 ejercicio6 = new Ejercicio6();

        ejercicio6.matrizTranspuesta();
    }

    public int[][] matrizTranspuesta(){

        int[][] matriz ={ {1,2,3},{4,5,6},{7,8,9} };
        int longitudMatriz = matriz.length;
        int[][] transpuesta = new int[longitudMatriz][longitudMatriz];

        for (int i = 0; i < longitudMatriz; i++) {
            for (int j = 0; j < longitudMatriz; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        return transpuesta;

    }

    public void mostrarMatriz(int[][] matriz){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
}