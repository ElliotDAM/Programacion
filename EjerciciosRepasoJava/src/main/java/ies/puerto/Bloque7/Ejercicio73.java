package main.java.ies.puerto.Bloque7;
/**
 * Desarrolla un programa que tome una cadena ingresada por el usuario y cuente cuántas vocales (a, e, i, o, u) contiene. Utiliza un bucle while.
 * @author ElliotDAM
 */
public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();

        int cantidadVocales = contarVocales(cadena);

        System.out.println("La cadena contiene "+cantidadVocales+ " vocales.");
        
    }

    public static int contarVocales(String cadena){
        int contador = 0;
        int i = 0;
        while(i < cadena.length()){
        char caracter = Character.toLowerCase(cadena.charAt(i));
           if(caracter == 'a'|| caracter == 'e' || caracter == 'i'|| caracter == 'o' || caracter == 'u'){
            contador++;
        }  
        i++;
        }
        return contador;
       
    }
}
