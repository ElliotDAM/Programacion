package ies.puerto.Ejercicio8;
import java.util.ArrayList;


import ies.puerto.Ejercicio2.OperacionesArrayList;

public class AppMayoresDIez {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>();

        enteros.add(12);
        enteros.add(14);
        enteros.add(10);
        enteros.add(12);
        System.out.println("Son mayores de diez: "+OperacionesArrayList.mayoresDiez(enteros));
    }
}
