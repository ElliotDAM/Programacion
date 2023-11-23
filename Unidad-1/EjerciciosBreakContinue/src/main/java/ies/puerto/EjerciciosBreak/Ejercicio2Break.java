package ies.puerto.EjerciciosBreak;
/**
 * Escribe un programa que encuentre el primer numero mayor que 100, utilizando break.
 * @author ElliotDAM
 */

public class Ejercicio2Break {

    public void primerNumeroPrimoMayor100(){
        
        for (int i = 100; i < 1000000; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                esPrimo = false;
                break;
                }
            }
           if(esPrimo){
            System.out.println("El primer numero primo mayor de 100 es:"+ i +".");
        }
    }

       
        /**
         * public boolean esPrimo(int valor){
         * for(int i=2;i < valor;i++){
         * if(valor % i == 0){
         * return false;
         * }
         * }
         * }
         */

        
    }
    
}
