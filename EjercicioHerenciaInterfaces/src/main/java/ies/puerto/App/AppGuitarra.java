package ies.puerto.App;

import ies.puerto.abstracto.GuitarraAbstract;
import ies.puerto.impl.Guitarra;

public class AppGuitarra {
    static GuitarraAbstract guitarra;
    public static void main(String[] args) {
        guitarra = new Guitarra();
        System.out.println(guitarra.cambiarCuerdas());
        System.out.println(guitarra.afinar());
        System.out.println(guitarra.tocarNota("La"));
    }
}
