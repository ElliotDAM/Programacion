package ies.puerto.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static List<Integer> listaNumerosPares;
    public static void main(String[] args) {
        listaNumerosPares = new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {
            if(esNumeroPar(i)){
                listaNumerosPares.add(i);
            }
        }
        System.out.println("Lista numeros pares: "+listaNumerosPares);
    }
/**
 * Funcion que verifica si un numero es par.
 * @param i numero que verifica
 * @return true/false si es o no par
 */
private static boolean esNumeroPar(int i){
    if(i % 2 == 0){
        return true;
    }
    return false;
}

}
