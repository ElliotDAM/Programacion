package ies.puerto.App;

//import ies.puerto.abstracto.EmpleadoAbstract;
//import ies.puerto.abstracto.PersonaAbstract;
//import ies.puerto.interfaz.ITrabajador;
import ies.puerto.impl.Alumno;
import ies.puerto.impl.Profesor;

public class AppPersona {
    //static EmpleadoAbstract empleado;
    static Profesor profesor;
    static Alumno alumno;
    public static void main(String[] args) {
        /**empleado = new ();
        System.out.println("El empleado trabaja: "+empleado.trabajar());
        System.out.println("Informacion empleado: "+empleado.toString());
        System.out.println("Salario trabajador: "+empleado.salario()); **/
        profesor = new Profesor();
        System.out.println("El profesor trabaja: "+profesor.trabajar());
        System.out.println("Informacion profesor: "+profesor.toString());
        System.out.println("El profesor imparte clase: "+profesor.impartirClase());
        alumno = new Alumno();
        System.out.println("El alumno tiene: "+alumno.anios(null)+"anios"); //pedir fecha al usuario
        System.out.println("El alumno estudia: "+alumno.estudiar());
        
        
    }
}
