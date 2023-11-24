package ies.puerto.EjerciciosContinue;
/**
 * Escribe un programa que imprima todos los numeros positivos en un array, usando
 * continue para omitir los numeros negativos.
 * @author ElliotDAM
 */
public class Ejercicio5Continue {
    
    public static void numerosPositivos(){
        int[] numeros = {-2, 5, -8, 10, 15, -3, 7};

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0){
                continue;
            }
            System.out.println(numeros[i]);
        }
    }
    
    public static void main(String[] args) {
        numerosPositivos();
    }
}
