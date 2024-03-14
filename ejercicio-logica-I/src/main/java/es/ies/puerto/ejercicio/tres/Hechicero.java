package es.ies.puerto.ejercicio.tres;

import java.util.ArrayList;
import java.util.List;

public class Hechicero {
/** 
    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        char[] textoChar = texto.toCharArray();
        int contador = 0;

        for (int i = 0; i < textoChar.length - 1; i++) {
            if(textoChar[i] == textoChar[i+1]){
                textoChar[i+1] = vocal;
                contador++;
            }
        }
        return vocal;
    }
    */
   String[] vocalesRepetidas;
   int[] conteoVocales;

    public Hechicero(){
        vocalesRepetidas = new ArrayList<>();
        conteoVocales = new Array();
    }
    

        public char vocalMasPoderosa(String texto){
            char vocal = ' ';
            texto = texto.toLowerCase();
            char[] textoChar = texto.toCharArray();

            for (String letra : textoChar) {
                //Varios ifs para el calculo de la letra
            }
            for (int i = 0; i < textoChar.length - 1; i++) {
                if(textoChar[i] == "aeiou"){
                    textoChar[i] = vocalesRepetidas; 
                }
            }
            int contadorA;
            int contadorE;
            int contadorI;
            int contadorO;
            int contadorU;

            for (int i = 0; i < vocalesRepetidas.length - 1; i++) {
                switch(vocalesRepetidas[i]){
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                    default:
                        break;
                }
            }
            
            conteoVocales.add(contadorA);
            conteoVocales.add(contadorE);
            conteoVocales.add(contadorI);
            conteoVocales.add(contadorO);
            conteoVocales.add(contadorU);
            

            for (int i = 0; i < conteoVocales.length; i++) {
                if(conteoVocales[i] > conteoVocales[i+1]){

                }
            }
            
            return vocal;
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