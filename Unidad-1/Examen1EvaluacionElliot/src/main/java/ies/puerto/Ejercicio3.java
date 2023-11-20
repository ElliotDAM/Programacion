package ies.puerto;

import java.sql.Array;

/**
 * Clase realizada para representar las fichas de un domino.
 * @author ElliotDAM
 */
public class Ejercicio3 {
    int[][] matriz = new int[7][7];

    /**
     * Metodo que representa las fichas de domino en una tabla.
     */
    public void fichasDomino(){

        int posicionMatriz = 0;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                    matriz[i][j] = matriz[posicionMatriz][j];
                    posicionMatriz ++;
            }
        }



    }

    public void sustituirFicha(int iNum, int jNum){

        String valorX = "X" ;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                matriz[iNum][jNum] = matriz [Integer.parseInt(valorX)][Integer.parseInt(valorX)];
            }
        }
    }

}
