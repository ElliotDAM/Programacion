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

        System.out.println("Vamos a imprimir el siguiente patrón: ");

        /*
            if (i == 1){
                System.out.println(i);
            }else if (i > 1 && i < 4){
                System.out.println(i+" "+(i+1));
            }else if (i > 3 && i < 7){
                System.out.println((i + " "+ (i+1)+" "+(i+2)));
            } else if (i > 6 && i < 10) {
                System.out.println((i + " "+ (i+1)+" "+(i+2)+ " "+(i+3)));
            }
*/
        for (int i = 1; i <= 1; i++){
            //Código a mejorar, no hace nada el bucle
            System.out.println(i);
            System.out.println(i+1+" "+(i+2));
            System.out.println((i+3)+" "+(i+4)+" "+(i+5));
            System.out.println((i+6)+" "+(i+7)+" "+(i+8)+" "+(i+9));

        }


    }
}