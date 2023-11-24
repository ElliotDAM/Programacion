package ies.puerto.EjerciciosContinue;
/**
 * Escribe un programa que imprima los numeros impares del 1 al 20, usando continue para omitir los numeros pares.
 * @author ElliotDAM
 */
public class Ejercicio2Continue {

     public void mostrarNumerosOmitiendoPares(){

        for (int i = 0; i <= 20; i++) {
            
            if(i % 2 == 0){
                System.out.println("Este numero no se puede mostrar. Pasa al siguiente.");
                continue;
            }            
            System.out.println(i);

        }
    }
    
}
