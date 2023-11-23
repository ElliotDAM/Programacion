package ies.puerto;
public class Ejercicio6{

    public void marcoMatriz(){
        int[][] matriz = new int[5][15];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                if(i == 0 || i == matriz.length -1){
                    matriz[i][j] = 1;
                }
                if( j == 0 || j == matriz[i].length){
                    matriz [i][j] = 1;
                }
            }
        }
//OTRO MODO DE HACERLO
        for (int i = 0; i < matriz.length ; i++) {
            if(i == 0 || i == matriz.length -1){
            matriz[i][0] = 1;
        }
            for (int j = 0; j <matriz[i].length ; j++) {
                if( j == 0 || j == matriz[i].length){
                    matriz [i][j] = 1;
                }
            }
        }
//OTRO MODO DE HACERLO

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                if(i == 0 || i == matriz.length -1){
                    matriz[i][j] = 1;
                } else if(j == 0 || j == matriz[i].length - 1){
                    matriz [i][j] = 1;
                }



            }
        }


    }
}