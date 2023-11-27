package main.java.ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) throws NumeroNegativoException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta un numero inferior a 0:");
        int numero = scanner.nextInt();

        if(esPositivo(numero)){
            System.out.println("El numero "+numero+" es positivo.");
        }
    }

    public static boolean esPositivo(int numero) throws NumeroNegativoException{
        
        if(numero < 0){
            throw new NumeroNegativoException("El numero que ha ingresado es negativo.");
        }
        return true;
    }
}
