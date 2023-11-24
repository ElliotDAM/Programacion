package ies.puerto;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ManejoDeExcepciones {
    public static void main(String[] args) {
       System.out.println("Hola chicos esto sera un error");

       try{
        File archivo = new File("archivo.txt");
        FileReader lector = new FileReader(archivo);
       }catch(ArithmeticException exception) {
            System.out.println("Es una excepcion aritmetica.");
       }catch(FileNotFoundException fileNotFoundException){
        System.out.println("Es una excepcion fileNotFoundException.");
       }
       
    }
}
