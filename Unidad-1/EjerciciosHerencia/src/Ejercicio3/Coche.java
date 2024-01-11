package Ejercicio3;

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(){}

    public Coche(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    
}
