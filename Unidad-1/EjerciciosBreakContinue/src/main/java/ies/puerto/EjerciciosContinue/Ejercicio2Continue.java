package ies.puerto.EjerciciosContinue;

public class Ejercicio2Continue {

     public void mostrarNumerosOmitiendoPares(){

        for (int i = 0; i <= 20; i++) {
            
            System.out.println(i);
            if(i % 2 == 0){
                System.out.println("Este numero no se puede mostrar. Pasa al siguiente.");
                continue;
            }
        }
    }
    
}
