package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTests {
    
    @Test
    public void testCrearEstudiante(){

        String nombre = "Saul";
        int edad = 20;
        String carrera = "Magisterio";
        double promedio = 6.2;

        Estudiante estudiante = new Estudiante(nombre, edad, carrera, promedio);

        Assertions.assertEquals(nombre, estudiante.getNombre(), "El nombre del estudiante no coincide.");
        Assertions.assertEquals(edad, estudiante.getEdad(), "La edad del estudiante no coincide.");
        Assertions.assertEquals(carrera, estudiante.getCarrera(), "La carrera del estudiante no coincide.");
        Assertions.assertEquals(promedio, estudiante.getPromedio(), "El promedio del estudiante no coincide.");
    }

    @Test
    public void testInfoEstudianteOk(){

        String nombre = "Saul";
        int edad = 20;
        String carrera = "Magisterio";
        double promedio = 6.2;

        Estudiante estudiante = new Estudiante(nombre, edad, carrera, promedio);

        String infoEsperada = "Nombre: Saul, Edad: 20, Carrera: Magisterio, Promedio: 6.2.";
        String infoObtenida = estudiante.infoEstudiante();

        Assertions.assertEquals(infoEsperada, infoObtenida, "La informacion del estudiante no coincide.");
    }

    @Test
    public void testComprobarAprobadoOk(){
        
        Estudiante estudiante = new Estudiante("Roberto", 20, "Informatica", 7.5);

        String resultadoEsperado = "Esta aprobado";
        String resultadoObtenido = estudiante.comprobarAprobado();

        Assertions.assertEquals(resultadoEsperado, resultadoObtenido, "Los resultados no coinciden.");

    }

    @Test
    public void testComprobarAprobadoSuspenso(){

        Estudiante estudiante = new Estudiante("Armando", 19, "Biologia", 4.9);

        String resultadoEsperado = "Esta suspendido";
        String resultadoObtenido = estudiante.comprobarAprobado();

        Assertions.assertEquals(resultadoEsperado, resultadoObtenido, "Los resultados no coinciden.");
    }

}
