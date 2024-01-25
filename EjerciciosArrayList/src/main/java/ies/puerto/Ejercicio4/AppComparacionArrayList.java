package ies.puerto.Ejercicio4;

import java.util.ArrayList;

public class AppComparacionArrayList {
    
    public static void main(String[] args) {
        ComparacionArrayList comparar = new ComparacionArrayList();
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista1.add(3);
        lista1.add(6);
        lista1.add(9);
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);

        boolean elementoIgual = comparar.comparacion(lista1, lista2);

        if(elementoIgual){
            System.out.println("Hay uno o mas elementos en comun");
        }else {
            System.out.println("No hay elementos en comun");
        }
    }
}
