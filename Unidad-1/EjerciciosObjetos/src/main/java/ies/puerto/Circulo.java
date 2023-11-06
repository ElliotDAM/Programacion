package ies.puerto;

/**
 * Objeto circulo creado para su interaccion con el mismo.
 */
public class Circulo{

    private int radio;

    /**
     * Constructor por defecto.
     */
    public Circulo(){}

    /**
     * Constructor con el parametro radio.
     * @param radio del circulo
     */
    public Circulo(int radio){
        this.radio = radio;
    }

    /**
     * Getters y setters del objeto.
     */
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * Metodo para calcular el area del circulo
     * @param radio
     * @return area del circulo.
     */
    public double areaCirculo(int radio){

        double area = (radio * radio) * Math.PI;
        return area;
    }

    /**
     * Metodo para calcular el perimetro de un circulo
     * @param radio
     * @return perimetro del circulo
     */
    public double perimetroCirculo(int radio){
        int diametro = 2 * radio;
        int perimetro = diametro * Math.PI;
        return perimetro;
    }
}