package es.ies.puerto;
/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
    }

    public void caracteresPresentes(String str1, String str2){
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();

        for (int i = 0; i <= str2Char.length - 1; i++) {
            if(str1Char[0] == str2Char[i]){
                
            }
        }
    }
}
