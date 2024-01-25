package ies.puerto.Ejercicio4;

import java.util.ArrayList;
/**
 * Crea un programa que compare dos ArrayList de enteros y devuelva true si tienen al menos 
 * un elemento en común, de lo contrario, devuelve false. a la lista.
 */
public class ComparacionArrayList {
    
    public boolean comparacion(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        for (Integer elemento : lista1) {
            if(lista2.contains(elemento)){
                return true;
            }
        }
        return false;
    }
}