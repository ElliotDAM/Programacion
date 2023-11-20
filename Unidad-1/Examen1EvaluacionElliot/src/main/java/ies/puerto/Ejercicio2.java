package ies.puerto;

/**
 * Clase creada para la representacion de la informacion de un estudiante y el calculo de su IMC.
 * @author ElliotDAM
 */
public class Ejercicio2 {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    /**
     * Constructor por defecto.
     */
    public Ejercicio2(){}

    /**
     * Constructores de clase.
     */
    public Ejercicio2(String nombre){
        this.nombre = nombre;
    }

    public Ejercicio2(int edad){
        this.edad = edad;
    }

    public Ejercicio2(double peso){
        this.peso = peso;
    }

    /*public Ejercicio2(double altura){
        this.altura = altura;
    }*/

    public Ejercicio2(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Ejercicio2(String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Ejercicio2(String nombre, int edad, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Getters y setters.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metodo para calcular el indice de masa muscular de un estudiante.
     * @param peso
     * @param altura
     * @return imc
     */
    public double calcularIMC(double peso, float altura){

        double imc = 0;

        imc = peso / (altura * altura);

        return imc;
    }

    /**
     * Metodo para mostrar la informacion del estudiante.
     * @return
     */

    public String mostrarInformacion(){

        return "Nombre:"+nombre+",Edad:"+edad+",Peso:"+peso+",Altura:"+altura+".";
    }

    public static void main(String[] args) {

        Ejercicio2 ejercicio2 = new Ejercicio2("Juan", 25, 66.2, 1.76);

    }

}
