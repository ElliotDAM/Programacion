package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static List<Integer> lista;
   public static void main(String[] args) {
    lista = new ArrayList<>();

    for (int i = 1; i < 10; i++) {
        if(i % 2 == 0){
            lista.add(i);
        }
    }

    System.out.println("Lista de numeros del 1 al 10: "+lista);
   }
    
}
