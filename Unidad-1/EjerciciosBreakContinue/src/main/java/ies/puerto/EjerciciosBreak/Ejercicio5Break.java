package ies.puerto.EjerciciosBreak;

public class Ejercicio5Break {

    public void numeroDivisible5YMayor30(){

        for (int i = 0; i < 10000000; i++) {
            if((i % 5 == 0) && (i > 30)){
                System.out.println("El primer numero divisible por 5 y mayor que 30 es"+i+".");
                break;
            }
        }
    }
    
}
