package ies.puerto.EjerciciosBreak;
/**
 * Escribe un programa que encuentre el primer numero mayor que 100, utilizando break.
 * @author ElliotDAM
 */

public class Ejercicio2Break {

    public void primerNumeroPrimoMayor100(){
        
        for (int i = 100; i < 1000000; i++) {
            for (int j = 2; j < i; j++) {
                if((i % i == 0) && (i % 1 == 0) && (i % j != 0)){
                System.out.println("El numero mayor de 100 primo es:"+i+".");
                break;
            }
            }
          
        }

        
    }
    
}
