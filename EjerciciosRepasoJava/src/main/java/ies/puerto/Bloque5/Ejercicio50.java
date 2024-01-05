package main.java.ies.puerto.Bloque5;
/**
 * Crea un programa que determine si un año ingresado por el usuario es bisiesto o no (recuerda que un año es bisiesto si es divisible por 4, pero no por 100, o si es divisible por 400).
 * @author ElliotDAM
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un anio");
        int anio = sc.nextInt();

        if((anio % 4 == 0 && anio % 100 != 0) ||(anio % 400 == 0)){
            System.out.println("El anio es bisiesto.");
        }else{
            System.out.println("El anio no es bisiesto");
        }
    }
}

