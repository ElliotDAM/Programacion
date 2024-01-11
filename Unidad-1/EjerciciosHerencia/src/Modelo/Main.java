package Modelo;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Sergio", 25, "78695543A");
        Estudiante estudiante = new Estudiante("Pepe", 22, "96859432D");

        System.out.println("Nombre Persona: "+persona.getNombre()+", Edad: "+persona.getEdad()+", DNI: "+persona.getDni());
        System.out.println("Nombre Estudiante: "+estudiante.getNombre()+", Edad: "+estudiante.getEdad()+", DNI: "+estudiante.getDni()+", curso: "+estudiante.getCurso()+", notas: "+estudiante.getNotas());
    }
    
}
