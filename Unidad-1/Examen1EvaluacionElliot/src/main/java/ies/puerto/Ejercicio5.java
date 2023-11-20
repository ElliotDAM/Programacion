package ies.puerto;

import java.util.Scanner;

/**
 * Clase creada para determinar el nombre del mes correspondiente a un numero dado.
 * @author ElliotDAM
 */
public class Ejercicio5 {
    /**
     * Metodo en if/else que determina que mes es el que introdujo el usuario en valor numerico
     * @param numero
     * @return mes
     */
    public String mesIfElse(int numero){
        String mes = "";

        if(numero == 1){
            mes = "Enero";
        } else if(numero == 2){
            mes = "Febrero";
        } else if(numero == 3){
            mes = "Marzo";
        } else if(numero == 4){
            mes = "Abril";
        } else if(numero == 5){
            mes = "Mayo";
        } else if(numero == 6){
            mes = "Junio";
        } else if(numero == 7){
            mes = "Julio";
        } else if(numero == 8){
            mes = "Agosto";
        } else if(numero == 9){
            mes = "Septiembre";
        } else if(numero == 10){
            mes = "Octubre";
        } else if(numero == 11){
            mes = "Noviembre";
        } else if(numero == 12){
            mes = "Diciembre";
        } else {
            mes = "El numero indicado no corresponde a ningun mes.";
        }

        return mes;
    }

    /**
     * Metodo en switch que determina el nombre del mes dado en valor numerico
     *
     * @return mes
     */
    public String mesSwitch(int numero){

        String mes = "";
        switch(numero){

            case 1:
                        mes = "Enero";
                        break;
            case 2:
                        mes = "Febrero";
                        break;
            case 3:
                        mes = "Marzo";
                        break;
            case 4:
                        mes = "Abril";
                        break;
            case 5:
                        mes = "Mayo";
                        break;
            case 6:
                        mes = "Junio";
                        break;
            case 7:
                        mes = "Julio";
                        break;
            case 8:
                        mes = "Agosto";
                        break;
            case 9:
                        mes = "Septiembre";
                        break;
            case 10:
                        mes = "Octubre";
                        break;
            case 11:
                        mes = "Noviembre";
                        break;
            case 12:
                        mes = "Diciembre";
                        break;
            default:
                        mes = "El numero introducido no corresponde con ningun mes.";
                        break;
        }

        return mes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ejercicio5 ejercicio5 = new Ejercicio5();

        System.out.println("Introduzca un numero de mes y le indicaremos su nombre.");
        int numero = sc.nextInt();
        String nombreMes = ejercicio5.mesIfElse(numero);
        System.out.println("El nombre del mes en base al numero introducido es:"+nombreMes+".");

        System.out.println("Indica de nuevo un numero de mes y le indicaremos su nombre.");
        int numeroDos = sc.nextInt();
        String nombreMesDos = ejercicio5.mesIfElse(numeroDos);
        System.out.println("El nombre del mes en base al numero introducido es:"+nombreMesDos+".");

    }


}
