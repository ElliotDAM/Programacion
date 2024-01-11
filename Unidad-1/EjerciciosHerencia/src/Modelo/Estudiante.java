public class Estudiante implements Persona {
    private String curso;
    private int notas;
    
    public Estudiante(String nombre, int edad, String dni, String curso, int notas){
        super(nombre, edad, dni);
        this.curso = curso;
        this.notas = notas;
    }
    public Estudiante(String curso, int notas) {
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getNotas() {
        return notas;
    }
    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public static String saludar(){
        return "Hola, soy un estudiante llamado "+ Persona.getNombre();
    }

    public static boolean autenticar(String usuario, String contrasenia){
        return Autenticacion.validacion(usuario, contrasenia);
    }

    
}
