package main.java.ies.puerto;
/**
 * Clase dedicada a obtener una función en la que calcule el máximo de dos números,
 * y otra función en la que se obtenga el máximo de 3 números dados
 * @author ElliotDAM
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       
    }
/**
 * Función que determina el maximo entre dos números
 * @param numero1 primer número para el cálculo del máximo
 * @param numero2 segundo número para el cálculo del máximo
 * @return numero1, numero2, según cuál sea el máximo
 */
    public int maximo (int numero1, int numero2){
        if (numero1 > numero2) {
            return numero1;
        }else {
            return numero2;
        }
    }
    
    /**
     * Función que determina el máximo entre tres números, llamando a la función anterior
     * @param numero1 primer número
     * @param numero2 segundo número
     * @param numero3 tercer número
     * @return maximoTotal el número máximo entre los 3
     */
    public int maximoTres (int numero1, int numero2, int numero3){
        int primerMaximo = maximo(numero1, numero2);
        int maximoTotal = maximo(primerMaximo, numero3);
        return maximoTotal;
    }
}