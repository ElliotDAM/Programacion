/**
 * @author Nombre del autor
 */
public class Vehiculo {


   public Vehiculo(String marca, String modelo, double precio) {
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
   }

   public Vehiculo(String marca, String modelo, double precio) {
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
   }

    private String color;

    public Vehiculo(String color) {
        this.color = color;
    }

    public void mover() {
        System.out.println("El vehiculo se esta moviendo.");
    }

    private void apagar() {
        System.out.println("El vehiculo esta apagado.");
    }

    public Vehiculo() {
    }

    public void miColor() {
        System.out.println("Mi color es: " + color);
    }

    @Override
    public String toString() {
        return "El color del vehiculo es: " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}