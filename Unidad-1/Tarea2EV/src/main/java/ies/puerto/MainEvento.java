package main.java.ies.puerto;

import java.util.Scanner;

public class MainEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el nombre del evento:");
        String nombre = sc.nextLine();
        System.out.println("Indique la fecha del evento:");
        String fecha = sc.nextLine();

        Evento evento = new Evento(nombre, fecha);

        System.out.println("Informacion sobre el evento:");
        System.out.println(evento.informacion());
        System.out.println(evento.estaProximo());
    }
}
