package main.java.ies.puerto;
/**
 * Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega números pares del 1 al 10 a la lista.
Crea un programa que demuestre el comportamiento correcto del programa App+NombreIdentificativo, o test unitarios que sistituyen a este.
@author ElliotDAM
 */
public class NumerosPares {

    public ArrayList<Integer> numerosPares(){
    List<Integer> lista = new ArrayList<>();

    for(int i = 1; i <= 10; i++){
        if(i % 2 == 0){
            lista.add(i);
        }
    }
    return lista;
    }

    @Override
    public String toString() {
        return "NumerosPares []";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    

    
}
