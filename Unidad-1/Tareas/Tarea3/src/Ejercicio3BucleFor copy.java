/**
 * @author ElliotDAM
 * Ejercicio número 3
 */
public class Ejercicio3BucleFor {

    /**
     * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. 
     * Utilia un buble __for__ y un bucle __while__.
    * @param args
     */
    public static void main(String[] args) {
        System.out.println("Sumatoria entre números del 1 al 10.");
        int suma = 0;
        for (int i = 1; i <=10; i++) {
            suma = suma + 1;
        }
        System.out.println("La suma es: "+ suma);

    }
}