package main.java.ies.puerto.App;

import main.java.ies.puerto.OperacionesArrayList;

public class AppOperaciones{
    public static void main(String[] args) {
        OperacionesArrayList operaciones = new OperacionesArrayList();

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Casa");
        lista.add("Mesa");
        lista.add("Cojin");
        lista.add("Movil");

        int palabrasConA = operaciones.contarPalabrasConA(lista);
        System.out.println("Cantidad de palabras por a: "+palabrasConA);
    }
}