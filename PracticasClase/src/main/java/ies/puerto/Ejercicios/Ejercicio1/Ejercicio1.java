package ies.puerto.Ejercicios.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
/**
 * Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega números pares del 1 al 10 a la lista
 * @author ElliotDAM
 */
public class Ejercicio1 {
    static List<Integer> listaNumerosPares;
    static List<Integer> listaNumerosImpares;

    public static void main(String[] args) {
        listaNumerosPares = new ArrayList<>();
        listaNumerosImpares = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if(esNumeroPar(i)){
                listaNumerosPares.add(i);
            }else{
                listaNumerosImpares.add(i);
            }
        }
        System.out.println("Lista numeros pares: "+listaNumerosPares);
        System.out.println("Tamanio: "+listaNumerosPares.size());
        System.out.println("Lista numeros impares: "+listaNumerosImpares);
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
