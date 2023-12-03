package String;
/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva linea.
 * @author ElliotDAM
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "Esto es una frase.";
//Utilizo un contador para saber la posicion de la frase cuando hay un espacio.
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {    
            if (frase.charAt(i) == ' ' || i == frase.length() - 1){
                String palabra = frase.substring(contador, i+1);
                System.out.println(palabra);
                contador = i + 1;
            }
           
        }
            
        }
    }

