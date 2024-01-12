public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String modelo, double precio, int numeroPuertas){
        super(marca, modelo, precio);
        this.numeroPuertas = numeroPuertas;
    }
    public int getNumeroPuertas(){
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
}
