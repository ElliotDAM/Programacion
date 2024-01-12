package ies.puerto.Ejercicio2;

public class Motocicleta extends Vehiculo{
    private String talla;
    private Vehiculo moto;

    public Motocicleta(){}
    
    public Motocicleta(String marca, String modelo, double precio, String talla){
        super(marca, modelo, precio);
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Marca motocicleta: "+moto.getMarca()+", Modelo: "+moto.getModelo()+", Precio: "+moto.getPrecio()+", Talla: "+getTalla();
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Vehiculo getMoto() {
        return moto;
    }

    public void setMoto(Vehiculo moto) {
        this.moto = moto;
    }
    
}
