/**
 * @author ElliotDAM
 */
public class Ejercicio1 {

    /**
     * Escribe un programa en Java que imprima el patrón siguiente:
     *
     * 1
     *
     * 2 3
     *
     * 4 5 6
     *
     * 7 8 9 10
     * @param args
     */
    public static void main(String[] args) {
        int numero = 1;
        int filas = 4;
        System.out.println("Vamos a imprimir el siguiente patrón: ");
        

        for (int i = 1; i <= filas; i++){
<<<<<<< HEAD
=======
            System.out.println();
>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938
            for (int j = 0; j < i; j++) {
                System.out.println(numero + " ");
                numero++;
            }
<<<<<<< HEAD
            System.out.println();
=======
           
>>>>>>> 4e703476a00f0bcf3b8e1bf0fc675a13ea385938
        }


    }
}