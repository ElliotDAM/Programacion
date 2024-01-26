package ies.puerto.Ejercicios.Ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Crea un programa que elimine los elementos duplicados de un ArrayList de cadenas y muestre la lista resultante.
 */
public class Ejercicio7 {
    static List<String> lista;
    
    public static List<String> eliminarCadenasDuplicadas(List<String> lista){
        List<String> resultado = new ArrayList<>();

        for (String elemento : resultado) {
            if(!resultado.contains(elemento)){
                resultado.add(elemento);
            }
        }
        
        return resultado;

    }
    
    public static void main(String[] args) {
        lista = new ArrayList<>(Arrays.asList("uno", "dos", "leche", "agua", "dos", "leche"));

        System.out.println("Lista sin duplicados: "+eliminarCadenasDuplicadas(lista));
    }
}
