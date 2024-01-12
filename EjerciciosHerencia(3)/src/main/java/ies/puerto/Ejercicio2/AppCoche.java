package ies.puerto.Ejercicio2;


public class AppCoche {
    public static void main(String[] args) {
        Coche coche = new Coche("Lamborghini", "Gallardo", 200000.50, 3);

        System.out.println("La marca del coche es: "+coche.getMarca()+", su modelo es: "+coche.getModelo()+", su precio es de: "+coche.getPrecio()+", y consta de "+coche.getNumeroPuertas()+" puertas.");
    }
}
