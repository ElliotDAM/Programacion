package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Escribe una función recursiva llamada cuentaRegresiva()
 * que imprima los números del 10 al 1 en orden descendente.
 */
public class Ejercicio1 {

    public List<Integer> cuentaDescendente(int numero){
        List<Integer> lista = new ArrayList<>();
        for (int i = numero; i > 0; i--) {
            lista.add(i);            
        }
        return lista;
    }

    public List<Integer> cuentaRegresiva(int numero){
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if(numero == 1){
            return lista;
        }
        
        lista.addAll(cuentaRegresiva(numero - 1));
        return lista;

    }

}
