package ies.puerto.App;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase "Animal" esta en el otro repaso.
 */
public class AppAnimal {
    static List<AppAnimal>animales;
    static List<String> fechas;

    public AppAnimal(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        String fecha1 = "22/01/2024";
        AppAnimal gato = new AppAnimal("mario", 12345678);
        animales = new ArrayList<>();
        

        if(!animales.contains(gato)){
            animales.add(gato);
        }
        for (AppAnimal animal : animales) {
            System.out.println(animal);
        }

        System.out.println(fechas);
        System.out.println(animales);
    }
}
