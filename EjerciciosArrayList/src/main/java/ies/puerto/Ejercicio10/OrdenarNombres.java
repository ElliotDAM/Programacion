package ies.puerto.Ejercicio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNombres {
    static ArrayList<String> nombres;

    public OrdenarNombres(){}

    public void pedirNombres(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos nombres desea introducir?");
        int numeroNombres = sc.nextInt();
        nombres = new ArrayList<>();
        for (int i = 1; i <= numeroNombres; i++) {
            System.out.println("Introduce el nombre numero "+i);
            String nombre = sc.nextLine();
            nombres.add(nombre);
        }
        Collections.sort(nombres);

        System.out.println("Lista nombres en orden:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    
}
