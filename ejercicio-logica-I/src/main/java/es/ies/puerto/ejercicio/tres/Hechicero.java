package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Map;

public class Hechicero {

   public char vocalMasPoderosa(String frase) {
        Map<Character, Integer> letras = new HashMap<>();
        letras.put('a', 0);
        letras.put('e', 0);
        letras.put('i', 0);
        letras.put('o', 0);
        letras.put('u', 0);

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letras.containsKey(letra)) {
                letras.put(letra, letras.get(letra) + 1);
            }
        }

        char vocalMasPoderosa = ' ';
        int maxFrecuencia = 0;

        for (Map.Entry<Character, Integer> letra : letras.entrySet()) {
            if (letra.getValue() > maxFrecuencia) {
                maxFrecuencia = letra.getValue();
                vocalMasPoderosa = letra.getKey();
            }
        }

        return vocalMasPoderosa;
    }
}
        
    

/**
 * Map<Character(String), Integer> letras = new HashMap<>();
 * letras.put(a,0);
 * .
 * .
 * .
 * letras.put(u,0);
 * for(String letra : frase){
 *      if(letras.containsKey()){
 *          letra;            
 *  }
 *          }
 */