package String;
/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva linea.
 * @author ElliotDAM
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "Esto es una frase.";

        String primeraPalabra = frase.substring(0,4);
        String segundaPalabra = frase.substring(5,7);
        String terceraPalabra = frase.substring(9,12);
        String cuartaPalabra = frase.substring(13,18);
       /*  //Se puede recorrer con while, pero faltan condiciones.
        while(frase.charAt(i) != " "){
            String palabra1 = charAt(i);
        }*/
        
        for (int i = 0; i < frase.length; i++) {
            int contador = 0;
            contador++;
            if (frase.charAt(i) == " "){

            }
            if (frase.charAt(i) != " "){
                contador = 0;
                
            }
        }
            
        }
    }
}
