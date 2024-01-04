package main.java.ies.puerto.Bloque3;
/**
 * Crea un programa que declare dos variables booleanas, representando por ejemplo si está lloviendo y si es de noche, 
 * y luego utilice operadores lógicos para determinar si se debe encender una lámpara.
 * @author ElliotDAM
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        boolean estaLLoviendo = false;
        boolean esDeNoche = false;
        boolean encenderLampara = false;
        if(estaLLoviendo || esDeNoche){
            encenderLampara = true;
        }

        if(encenderLampara){
            System.out.println("Se debe encender la lampara");
        }else{
            System.out.println("No se debe encender la lampara");
        }
    }
}
