package ies.puerto.Ejercicio2;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(){}
    
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
    @Override
    public String toString() {
        return "Coche [numeroPuertas=" + numeroPuertas + "]";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coche other = (Coche) obj;
        if (numeroPuertas != other.numeroPuertas)
            return false;
        return true;
    }
}
