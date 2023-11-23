package main.java.ies.puerto.EjerciciosContinue;
/**
 * Escribe un programa que busque y cuente los números mayores que 50 en un array, usando continue para omitir los números menores o iguales a 50.
 * @author ElliotDAM
 */
public class Ejercicio4Continue {
    
    int[] numeros = {40,60,30,80,50,45,70};

    public void contarNumeros(){
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] <= 50){
                continue;
            }
            contador ++;
        }
        System.out.println("Hay "+contador+" numeros mayores de 50.");
    }
}
