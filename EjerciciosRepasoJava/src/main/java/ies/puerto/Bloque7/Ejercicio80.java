package main.java.ies.puerto.Bloque7;
import java.util.Scanner;
/**
 * Desarrolla un programa que incluya un bucle while que se ejecute infinitamente. Asegúrate de proporcionar una condición de salida adecuada.
 * @author ElliotDAM
 */
public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("Este bucle es infinito");
            System.out.println("¿Quiere continuar?");
            String resp = sx.nextLine();

            if(respuesta.equalsIgnoreCase("No")){
                continuar = false;
            }
    }
    System.out.println("Has salido del bucle.");
}
}
