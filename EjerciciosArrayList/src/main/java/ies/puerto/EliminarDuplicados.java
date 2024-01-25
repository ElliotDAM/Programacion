package main.java.ies.puerto;

public class EliminarDuplicados {
    
    public static List<String> eliminarDuplicados(ArrayList<String> lista){
        Lista<String> listaSinDuplicados = new ArrayList<>();

        for (String elemento : lista) {
            if(!listaSinDuplicados.contains(elemento)){
                listaSinDuplicados.add(elemento);
            }
        }
        return listaSinDuplicados;
    }
}
