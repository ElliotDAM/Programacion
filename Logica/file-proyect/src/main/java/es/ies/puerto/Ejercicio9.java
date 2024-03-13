package es.ies.puerto;
/**
 * *
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */
 
public class Ejercicio9 {
    
    public static void main(String[] args) {
        int dias = 1;
        int horas = 4;
        int minutos = 50;
        int segundos = 50;
        int milisegundos = conversorAMilisegundos(dias, horas, minutos, segundos);
        System.out.println(milisegundos);
    }

    public static int conversorAMilisegundos(int dias, int horas, int minutos, int segundos){
        
        int diasMilisegundos = (dias * 24 * 60 * 60 * 1000);
        int horasMilisegundos = (horas * 60 * 60 * 1000);
        int minutosMilisegundos = (minutos * 60 * 1000);
        int segundosMilisegundos = segundos * 1000;

        int suma = diasMilisegundos + horasMilisegundos + minutosMilisegundos + segundosMilisegundos;

        return suma;

    }
}
