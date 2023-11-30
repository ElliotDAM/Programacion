package main.java.ies.puerto;
/**
 * Crea una excepcion personalizada llamada NombreInvalidoException que se lance cuando un metodo reciba un nombre nulo o vacio como argumento.
 * Implementa una clase que contenga un metodo que acepte un nombre y lance esta excepcion si es invalido.
 * 
 * @author ElliotDAM
 */
public class Ejercicio10 {
    
    /*public static void main(String[] args) throws MiException {
        boolean verdadero = true;
       
             metodoConCondicion(verdadero);
        
       
    }

    public static void metodoConCondicion(boolean verdadero)throws MiException{
        
        if(verdadero){
            throw new MiException(1, "MiException lanza un mensaje.");
        }
    }*/

    public static void main(String[] args) throws MiExcepcion{
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        System.out.println("Escriba el nombre: ");
        nombre = sc.nextLine();

        if(nombre == null || nombre.isEmpty()){
            throw new MiExcepcion("No es un tipo de nombre adecuado.");
        }
    }
}
