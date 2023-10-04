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
        int i = 0;
        while(i <= 10){
            suma = suma + 1;
            i++;
        }
        System.out.println("La suma es: "+ suma);
    }
}