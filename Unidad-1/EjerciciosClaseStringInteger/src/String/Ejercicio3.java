package String;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        String cadena = "Murcielago";
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char ch = cadena.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                contador++;
            }
            
        }
        System.out.println("En la palabra "+cadena+" hay: "+contador+" vocales.");
    }
}
