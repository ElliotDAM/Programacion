package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Desarrolla una función recursiva llamada imprimirPares() 
 * que imprima todos los números pares del 1 al N.
 */
public class Ejercicio3 {

    public List<Integer> imprimirPares(int numero){
        List<Integer> listaPares = new ArrayList<>();
        for (int i = 0; i < numero + 1; i+=2) {
                listaPares.add(numero);    
        }
        return listaPares;
        
    }

    public List<Integer> paresRecursivo(int numero){
        List<Integer> listaParesRecursivos = new ArrayList<>();
        if(numero % 2 == 0){
            listaParesRecursivos.add(numero);
        }
        if(numero == 0){
            return listaParesRecursivos;
        }

        listaParesRecursivos.addAll(paresRecursivo(numero - 1));
        return listaParesRecursivos;
    }
}
