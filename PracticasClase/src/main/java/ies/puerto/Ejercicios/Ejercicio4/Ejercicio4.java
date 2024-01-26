package ies.puerto.Ejercicios.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Crea un programa que compare dos ArrayList de enteros y devuelva true si tienen al menos un elemento en común, 
 * de lo contrario, devuelve false. a la lista. 
 */
public class Ejercicio4 {
    
    static List<Integer> lista1;
    static List<Integer> lista2;
    
/**
 * Funcion que comprueba si un elemento de una lista existe o no
 * @param lista1 de Integer
 * @param lista2 de Integer
 * @return true/false segun los elementos en comun
 */
    static boolean elementosComun(List<Integer> lista1, List<Integer> lista2){
        
        if(lista2.size() < lista1.size()){
            List<Integer> temporal = lista1;
            lista1 = lista2;
            lista2 = temporal;
        }

        for (Integer elemento : lista1) {
            if(lista2.contains(elemento)){
                return true;
            }
        }
        return false;
    }

     static boolean elementosComunRecursivo(List<Integer> lista1, List<Integer> lista2){
        
        if(lista2.size() < lista1.size()){
           elementosComunRecursivo(lista2, lista1);
        }

        for (Integer elemento : lista1) {
            if(lista2.contains(elemento)){
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        lista1 = new ArrayList<>();
        lista1.addAll(Arrays.asList(1,2,4));

        lista2 = new ArrayList<>(Arrays.asList(10,20,5,6,4,9));
        List<Integer> listaComunes = new ArrayList<>(Arrays.asList(10,20,5,6,9));
        System.out.println("Las listas tienen elementos comunes: "+elementosComun(lista1, lista2));

        System.out.println("Las listas tienen elementos comunes: "+elementosComun(lista1, listaComunes));
    }
}
