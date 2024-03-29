package ies.puerto.App;

import ies.puerto.impl.LecturaDatosFichero;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {
    static ILecturaDatos lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosFichero();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        tipo(lecturaDatos);
    }

    public static void tipo(ILecturaDatos lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}
