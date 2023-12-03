package Integer;

import java.util.InputMismatchException;

/**
 * Crea un programa que tome un numero entero como entrada y verifique si es par o impar utilizando los metodos de la clase Integer.
 * Controla la excepcion que pudiera generar.
 * @author ElliotDAM
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero:");
            int numero = sc.nextInt();

            if(numero % 2 == 0){
                System.out.println("El numero es par.");
            }else{
                System.out.println("El numero es impar.");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Debe ingresar un numero entero.");
        }
    }
}
