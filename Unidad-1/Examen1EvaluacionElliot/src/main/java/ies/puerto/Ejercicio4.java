package ies.puerto;

import java.util.Scanner;

/**
 * Clase creada para simular el juego de las 5 puertas.
 * @author ElliotDAM
 */
public class Ejercicio4 {

    int[] arrayPuertas = {0, 0, 0, 0, 0};

    /**
     * Metodo para abrir una de las puertas señaladas por el usuario.
     * @param numeroPuerta numero de puerta que determina el usuario
     * @return abierta la puerta
     */
    public boolean abrirPuerta(int numeroPuerta) {

        boolean abierta = false;

        if (arrayPuertas[numeroPuerta] == 0) {
            arrayPuertas[numeroPuerta] = 1;
            abierta = true;
        }

        return abierta;
    }

    /**
     * Metodo para cerrar una de las puertas indicadas por el usuario
     * @param numeroPuerta que determina el usuario
     * @return cerrada la puerta
     */
    public boolean cerrarPuerta(int numeroPuerta) {

        boolean cerrada = false;

        if (arrayPuertas[numeroPuerta] == 1) {
            arrayPuertas[numeroPuerta] = 0;
            cerrada = true;
        }

        return cerrada;
    }

    /**
     * Metodo creado para cambiar el estado de la puerta dada.
     * @param numeroPuerta que determina el usuario
     * @return estadoActualPuerta que determina que estado tiene actualmente
     */
    public String cambiarEstadoPuerta(int numeroPuerta) {

        String estadoActualPuerta = "";
        if (arrayPuertas[numeroPuerta] == 1) {
            arrayPuertas[numeroPuerta] = 0;
            estadoActualPuerta = "Puerta cerrada";
        } else if (arrayPuertas[numeroPuerta] == 0) {
            arrayPuertas[numeroPuerta] = 1;
            estadoActualPuerta = "Puerta abierta";
        }

        return estadoActualPuerta;
    }

    /**
     * Metodo creado para mostrar en que estado se encuentran todas las puertas.
     * @return estadoPuerta en el que describe si la puerta esta abierta o cerrada
     */
        public String mostrarEstadoPuertas(){

            String estadoPuerta = "";
            for (int i = 0; i < arrayPuertas.length; i++) {
                if (arrayPuertas[i] == 0) {
                    estadoPuerta = "La puerta" + (i + 1) + " esta cerrada.";
                } else if (arrayPuertas[i] == 1) {
                    estadoPuerta = "La puerta" + (i + 1) + " esta abierta.";
                }
            }
            return estadoPuerta;

        }

    public static void main(String[] args) {
            Ejercicio4 ejercicio4 = new Ejercicio4();
            Scanner sc = new Scanner(System.in);
        System.out.println("Tenemos 5 puertas con diferentes funciones." +
                "1. Abrir puerta." +
                "2. Cerrar puerta." +
                "3. Cambiar estado puerta." +
                "4. Mostrar estado puertas." +
                "¿Que opcion desea utilizar?");
        int opcion = sc.nextInt();
        int puerta = 0;
        switch(opcion){
            case 1:
                System.out.println("¿Qué puerta desea abrir?");
                puerta = sc.nextInt();
                    ejercicio4.abrirPuerta(puerta);
                    break;
            case 2:
                System.out.println("¿Qué puerta desea cerrar?");
                puerta = sc.nextInt();
                ejercicio4.cerrarPuerta(puerta);
                break;
            case 3:
                System.out.println("¿A que puerta desea cambiarle el estado?");
                puerta = sc.nextInt();
                    ejercicio4.cambiarEstadoPuerta(puerta);
                    break;
            case 4:
                    ejercicio4.mostrarEstadoPuertas();
                    break;
            default:
                System.out.println("No hay opcion para el numero introducido.");
                break;
        }


    }
    }

