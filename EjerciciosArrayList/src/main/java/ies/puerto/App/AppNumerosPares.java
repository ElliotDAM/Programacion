package main.java.ies.puerto.App;

import main.java.ies.puerto.NumerosPares;

public class AppNumerosPares {
    public static void main(String[] args) {
        NumerosPares pares = new NumerosPares();

        ArrayList<Integer> lista = pares.numerosPares();

        System.out.println("Lista pares del 1 al 10: "+lista);
    }
}
