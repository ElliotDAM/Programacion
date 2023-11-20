package ies.puerto;

/**
 * Clase creada para realizar un triangulo equilatero.
 * @author ElliotDAM
 */
public class Ejercicio1 {

    public static int trianguloEquilatero(int numeroFilas){
        int triangulo = 1;

        if(numeroFilas == 0 || numeroFilas < 0){
            System.out.println("El numero de filas debe ser positivo.");
        }

        for (int i = 0; i < numeroFilas ; i++) {
            triangulo = triangulo + 2;
        }
        return triangulo;
    }

    public static void main(String[] args) {

       int triangulo = trianguloEquilatero(4);
    }
}
