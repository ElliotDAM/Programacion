package ies.puerto.Ejercicio2;

public class Vehiculo {

   private String marca;
   private String modelo;
   private double precio;

   public Vehiculo(){}

   public Vehiculo(String marca, String modelo, double precio){
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
   }
   public String getMarca(){
    return marca;
   }

   public void setMarca(String marca){
    this.marca = marca;
   }

   public String getModelo(){
    return modelo;
   }

   public void setModelo(String modelo){
    this.modelo = modelo;
   }

   public double getPrecio(){
    return precio;
   }

   public void setPrecio(double precio){
    this.precio = precio;
   }

   @Override
   public String toString() {
      return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Vehiculo other = (Vehiculo) obj;
      if (marca == null) {
         if (other.marca != null)
            return false;
      } else if (!marca.equals(other.marca))
         return false;
      if (modelo == null) {
         if (other.modelo != null)
            return false;
      } else if (!modelo.equals(other.modelo))
         return false;
      if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
         return false;
      return true;
   }


   

   
}
