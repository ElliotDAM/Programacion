package ies.puerto.EjerciciosContinue;
/**
 * Escribe un programa que sume todos los números pares del 1 al 10, usando continue para omitir los números impares.
 * @author ElliotDAM
 */
public class Ejercicio3Continue {
    
    public void sumaNumeros(){
        int suma = 0;
        for (int i = 0; i <= 10; i++) {
            if(i % 2 != 0){
                continue;
            }
            suma = suma + i;
        }

        
    }
}
