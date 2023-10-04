package org.example;

/**
 * @author ElliotDAM
 */
public class Tarea2 {

    /**
     * Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo él mismo). Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y 1 + 2 + 3 = 6.
     * El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000). Más información.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos el rango entre los que deseamos observar los numeros.
        int numeroMenor;
        int numeroMayor;
        int divisor;

        System.out.println("Números perfectos");
        System.out.println("Indicamos el rango que queremos buscar.");
        System.out.println("Empezamos por el rango menor");
        numeroMenor = sc.nextInt();
        System.out.println("Rango mayor");
        numeroMayor = sc.nextInt();

        // Calculamos qué números son perfectos entre 1 y 1000

        for (int i = numeroMenor; i <= numeroMayor ; i++) {

        }



    }
}