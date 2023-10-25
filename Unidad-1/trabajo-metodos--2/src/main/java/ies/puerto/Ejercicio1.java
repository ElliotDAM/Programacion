package ies.puerto;

/**
 * Clase con el objetivo de calcular el sueldo de un trabajador en base al numero de horas que trabaja
 * @author ElliotDAM
 */
public class Ejercicio1 {

    /**
     * @param numeroHoras numero de horas que trabaja el usuario
     * @param valorHoras precio a la que se paga la hora de trabajo
     * @return sueldo que cobrara el usuario
     */
    
    public int calcularSueldoHoras(int numeroHoras){
        int sueldo = 0;
        int valorHoras = 10;
        sueldo = numeroHoras * valorHoras;
        return sueldo;
    }
}
