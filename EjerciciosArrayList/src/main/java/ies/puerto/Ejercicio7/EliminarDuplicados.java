package ies.puerto.Ejercicio7;

import java.util.ArrayList;
import java.util.List;
/**
 * Crea un programa que elimine los elementos duplicados de un ArrayList de cadenas y muestre la lista resultante
 * @author ElliotDAM
 */
public class EliminarDuplicados {
    
    public static List<String> eliminarDuplicados(){
        List<String> lista = new ArrayList<>();
        List<String> listaSinDuplicados = new ArrayList<>();

        for (String elemento : lista) {
            if(!listaSinDuplicados.contains(elemento)){
                listaSinDuplicados.add(elemento);
            }
        }
        return listaSinDuplicados;
    }
}
