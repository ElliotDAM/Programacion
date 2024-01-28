package ies.puerto.ParteDos.App;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import ies.puerto.ParteDos.imp.Profesor;

public class AppProfesor {
    static List<Profesor> profesores;
        Profesor profesor1 = new Profesor("Maria", "78345678A", "01/01/1980", 3000f, "Matemáticas");
        Profesor profesor2 = new Profesor("Jonny", "44456789B", "15/05/1975", 2000f, "Historia");
        
        profesores = new ArrayList<>();
        profesores.add(profesor1);
        profesores.add(profesor2);

        // Imprimir información de los profesores
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }

        // Realizar operaciones con los métodos de la clase Profesor
        System.out.println("Salario Medio de los Profesores: " + Profesor.salarioMedio(profesores));
        System.out.println("Salario Máximo de los Profesores: " + Profesor.salarioMaximo(profesores));
        System.out.println("Salario Mínimo de los Profesores: " + Profesor.salarioMinimo(profesores));

        String dniBuscar = "23456789B";
        Profesor profesorEncontrado = Profesor.buscarPorDni(dniBuscar, profesores);
        if (profesorEncontrado != null) {
            System.out.println("\nProfesor encontrado por DNI (" + dniBuscar + "): " + profesorEncontrado);
        } else {
            System.out.println("\nProfesor no encontrado por DNI (" + dniBuscar + ")");
        }

        try {
            System.out.println("\nEdad Media de los Profesores: " + Profesor.edadMediaProfesores(profesores));
        } catch (ParseException e) {
            e.printStackTrace();
        }
}
}
