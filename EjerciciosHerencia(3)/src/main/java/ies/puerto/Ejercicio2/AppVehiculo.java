package ies.puerto.Ejercicio2;



public class AppVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Mercedes", "Benz", 130000.23);

        System.out.println("La marca del vehiculo es: "+vehiculo.getMarca()+", su modelo es "+vehiculo.getModelo()+" y su precio es de: "+vehiculo.getPrecio());
    }
}
