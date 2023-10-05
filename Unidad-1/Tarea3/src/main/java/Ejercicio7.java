import java.util.Scanner;
/**
 * author ElliotDAM
 */

    /**
     * 7. Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
     * El día a verificar se debe de pedir por teclado.
     * @param args
     */
public class Ejercicio7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int dia;
            System.out.println("Dias de la semana");
            System.out.println("Indicame el número del día que deseas proyectar");
            dia = sc.nextInt();
            switch (dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Ese número no corresponde con un día de la semana");
                    break;
            }
        }
    }

