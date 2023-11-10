package ies.puerto;

public class Ejercicio8{

    static Ejercicio7 ejercicio7 = new Ejercicio7();

    public static int[] eliminarDuplicados(int[] array){

        //int[] array = {1,3,4,5,4,6};
        int[] arrayOrdenado= ejercicio7.ordenAscendente(array);
        int tamañoArray = array.length;

        int posicion = 0;

        for (int i = 0; i < tamañoArray - 1; i++) {
            if(arrayOrdenado[i] != arrayOrdenado[i+1]){
                arrayOrdenado[posicion]=arrayOrdenado[i];
                posicion++;
            }
        }
        arrayOrdenado[posicion]=arrayOrdenado[tamañoArray - 1];

        int[] arraySinDuplicados = new int[posicion + 1];
        for (int i = 0; i < arraySinDuplicados.length; i++) {
            arraySinDuplicados[i]=arrayOrdenado[i];
        }

        return arraySinDuplicados;
    }
}