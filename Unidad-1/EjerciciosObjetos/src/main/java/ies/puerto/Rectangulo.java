package ies.puerto;
/**
 * Objeto creado para el tratamiento de los datos de un rectangulo.
 * @author ElliotDAM
 */
public class Rectangulo{
    private int largo;
    private int ancho;

    /**
     * Constructor por defecto
     */
    public Rectangulo(){}

    /**
     * Constructor de la clase
     * @param largo
     * @param ancho
     */
    public Rectangulo (int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public double areaRectangulo(int largo, int ancho){

        double area = largo * ancho;
        return area;
    }

    public double perimetroRectangulo(int largo, int ancho){

        double perimetro = (largo * 2) + (ancho * 2);
        return perimetro;
    }
}