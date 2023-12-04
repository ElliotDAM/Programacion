package ies.puerto;
/**
 * Desarrolla un programa que extraiga todos los numeros de telefono validos(con formato +XX-XXX-XX-XX-XX) de una cadena dada.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "+34-654-44-55-66";

        //String expresion = "^(\\d{9})-(\\d{9})$";

        String expresion = "^([^a-zA-Z0-9]\\d{2})-(\\d{3})-(\\d{2})-(\\d{2})-(\\d{2})$";
        //Expresion tambien valida.
        //String expresion = "^(\\+\\d{2})-(\\d{3})-(\\d{2})-(\\d{2})-(\\d{2})$";

        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(cadena);

        while(matcher.matches()){
         String prefijo = matcher.group(1);
         String primerosNumeros = matcher.group(2);
         String segundosNumeros = matcher.group(3);
         String tercerosNumeros = matcher.group(4);
         String ultimosNumeros = matcher.group(4);

            System.out.println("Prefijo: "+prefijo+"\n
                                );
        }
    }
}
