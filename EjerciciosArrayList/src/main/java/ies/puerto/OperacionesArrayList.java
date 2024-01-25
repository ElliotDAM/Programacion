package main.java.ies.puerto;

import java.util.ArrayList;

public class OperacionesArrayList {
    public int contarPalabrasConA(ArrayList<String> lista){
        int contador = 0;

        for (String palabra : lista) {
            if(palabra.startsWith("A") || palabra.startsWith("a")){
                contador++;
            }
        }
        return contador;
    }

    public List<Integer> numerosPares(ArrayList<Integer> listaNumeros){
        List<Integer> listaPares = new ArrayList<>();
        for (Integer numero : listaNumeros) {
            if(numero % 2 == 0){
                listaPares.add(numero);
            }
        }
        return listaPares;
    }

    @Override
    public String toString() {
        return "OperacionesArrayList []";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
