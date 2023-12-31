import java.util.Scanner;

/**
 * author ElliotDAM
 */
public class Ejercicio8 {
    /**
     * Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos el rango entre los que deseamos observar los numeros.
        int numeroMenor;
        int numeroMayor;
        int suma;

        System.out.println("Números perfectos");
        System.out.println("Indicamos el rango que queremos buscar.");
        System.out.println("Empezamos por el rango menor");
        numeroMenor = sc.nextInt();
        System.out.println("Rango mayor");
        numeroMayor = sc.nextInt();

        //Se hace la iteración sobre los rangos dados por el usuario
        for (int i = numeroMenor; i <= numeroMayor ; i++) {
                suma = 0;
        //Se calcula la suma de los divisores de cada número
                for (int j = numeroMenor; j < i; j++) {
                        if (i % j == 0){
                            suma = suma + i;
                        }
                }
        //Se comprueba si la suma de sus divisores es igual al numero. Si lo es, se imprime.
                if (suma == i){
                    System.out.println("El número "+ i + "es un número perfecto.");
                }
        }
    }
}
