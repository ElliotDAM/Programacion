package ies.puerto.Ejercicio1;

public class AppEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Elliot", 29, "78695048D", "1DAM", 7.5 );

        estudiante.getCurso();
        estudiante.getNotas();

        System.out.println("Este estudiante esta en el curso "+estudiante.getCurso()+" y sus notas han sido: "+estudiante.getNotas());
        
    }
}
