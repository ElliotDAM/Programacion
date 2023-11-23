package ies.puerto.EjerciciosBreak;

/**
 * Escribe un programa que encuentre el primer numero divisible por 7 y 5 entre 1 y 100(inclusive) utilizando break
 * @author ElliotDAM
 */
public class Ejercicio1Break {

    /**
     * Metodo realizado para comprobar el primer numero divisible por 7 y 5 entre 1 y 100.
     * @return 
     */
    public void numeroDivisibleSieteYCinco(){

        for(int i = 1; i <= 100; i++){
            int numero = i;
            if((numero % 7 == 0) && (numero % 5 == 0)){
                System.out.println("El numero es:"+numero+". Saliendo del bucle.");
                break;
            }
        }
    }
//Creo un main para comprobar si el metodo funciona.
    public static void main(String[] args) {
        
          for(int i = 1; i <= 100; i++){
            int numero = i;
            if((numero % 7 == 0) && (numero % 5 == 0)){
                System.out.println("El numero es:"+numero+". Saliendo del bucle.");
                break;
            }
        }
    }

}