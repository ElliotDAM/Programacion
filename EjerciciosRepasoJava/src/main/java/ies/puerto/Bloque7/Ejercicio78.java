package main.java.ies.puerto.Bloque7;
import java.util.Scanner;
/**
 * Crea un programa que simule el juego "Piedra, Papel o Tijera" contra la computadora utilizando un bucle do-while. El juego debe continuar hasta que el usuario elija salir.
 * @author ElliotDAM
 */
public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int opcionUsuario;
        int opcionMaquina;
        String[] opciones ={"Piedra", "Papel", "Tijera"};
        String resultado;

        do {
            System.out.println("Elija una opcion ingresando el numero correspondiente");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("0. Salir");

            opcionUsuario = sc.nextInt();

            if(opcionUsuario >= 1 && opcionUsuario <= 3){
                opcionMaquina = random.nextInt(3) + 1;

                System.out.println("Usuario: "+opciones[opcionUsuario - 1]);
                System.out.println("Maquina: "+opciones[opcionMaquina - 1]);

            }else if(opcionUsuario == 0){
                System.out.println("Saliendo del juego.");
            }else{
                System.out.println("Opcion no valida");
            }
        } while (opcionUsuario != 0);
    }

    public static String ganadorJuego(int usuario, int maquina){
        String resultado = "";
        if(usuario == maquina){
            resultado = "Empate";
        }else if((usuario == 1 && maquina == 3)||(usuario == 2 && maquina == 1)||(usuario == 3 && maquina == 2)){
            resultado = "Ganaste";
        }else{
            resultado = "La maquina gana. Intentalo de nuevo";
        }
        return resultado;
    }


}
