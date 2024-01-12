package ies.puerto.Ejercicio2;

public class AppMotocicleta {

    public static void main(String[] args) {
        Motocicleta motocicleta = new Motocicleta("Kawasaki", "Ninja", 2300.00, "L");

        System.out.println("La moto de marca "+motocicleta.getMarca()+" modelo "+motocicleta.getModelo()+" y precio: "+motocicleta.getPrecio());
        //System.out.println(motocicleta.toString());
    }
    
    


}
