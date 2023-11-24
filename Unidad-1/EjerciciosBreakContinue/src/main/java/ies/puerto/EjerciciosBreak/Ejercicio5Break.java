package ies.puerto.EjerciciosBreak;
/**
 * 
 * @author ElliotDAM
 */
public class Ejercicio5Break {

    public void numeroDivisible5YMayor30(){

        for (int i = 31; i < 10000000; i++) {
            if((i % 5 == 0)){
                System.out.println("El primer numero divisible por 5 y mayor que 30 es"+i+".");
                break;
            }
        }
    }
    
}
