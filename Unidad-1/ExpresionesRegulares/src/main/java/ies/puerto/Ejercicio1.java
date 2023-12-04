package ies.puerto;
/**
 * Crea un programa que valide si una cadena es una direccion de correo electronico valida utilizando expresiones regulares
 * @author ElliotDAM
 */
public class Ejercicio1 {

    public static void main(String[] args){

        String email = "usuario@dominio.com";

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compule(regex);
        Matcher matcher = pattern.matcher(email);

        if(){
            System.out.prinln("La direccion de correo electronico es valida.");
        }else {
            System.out.println("La direccion de correo electronico no es valida.");
        }
    }    
}
