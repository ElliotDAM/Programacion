package ies.puerto.EjerciciosContinue;
/**
 * Escribe un programa que escriba los numeros de 1 al 20 y oprima los numeros que son multiplos de 3 con continue.
 */
public class Ejercicio1Continue {

    public void mostrarNumeros(){

        for (int i = 0; i <= 20; i++) {
            
            System.out.println(i);
            
            if(i % 3 == 0){
                System.out.println("Este numero no se puede mostrar. Pasa al siguiente.");
                continue;
            }
        }
    }

    
    
}
