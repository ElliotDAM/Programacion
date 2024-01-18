package main.java.ies.puerto.impl;

public class Circulo implements IFormaGeometrica{
    private float radio;
    
    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea(){
        return Math.PI * (radio*radio);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
