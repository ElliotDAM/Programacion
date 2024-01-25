package main.java.ies.puerto;

import java.util.ArrayList;

public class ComparacionArrayList {
    
    public static boolean comparacion(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        for (Integer elemento : lista1) {
            if(lista2.contains(elemento)){
                return true;
            }
        }
        return false;
    }
}