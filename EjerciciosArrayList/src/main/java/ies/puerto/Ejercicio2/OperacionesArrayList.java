package ies.puerto.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Escribe un método en una clase llamada OperacionesArrayList que reciba 
 * un ArrayList de cadenas y devuelva la cantidad de elementos que comienzan
 * con la letra 'A'. a la lista.
 * @author ElliotDAM
 */
public class OperacionesArrayList {
    static List<String> listaString;
   
    public static boolean comienzaPorA(String cadena){
        String regex = "^[a|A].*";
            
        if(Pattern.matches(regex, cadena)){
            return true;
        }
        return false;
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

    public static boolean mayoresDiez(ArrayList<Integer> enteros){
        for (Integer entero : enteros) {
            if(entero <= 10){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        listaString = new ArrayList<>();
        listaString.add("No comienzo por A");
        listaString.add("Tampoco comienzo por A");
        listaString.add("A veces comienzo por A");
        listaString.add("Adios mundo cruel");
        listaString.add("El profe de programacion es el mejor");
        listaString.add("Le vamos a traer una caja de dulces");
        listaString.add("Angelo trae la caja de dulces");
        int contador = 0;
        for (String cadena : listaString) {
            if(comienzaPorA(cadena)){
                contador++;
            }
            System.out.println("Numero de palabras que empiezan con a: "+contador);
        }
    }
}
