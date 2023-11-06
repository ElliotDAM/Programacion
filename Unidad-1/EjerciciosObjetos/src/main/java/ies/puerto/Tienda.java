package main.java.ies.puerto;

public class Producto{
    private String nombre;
    private int precio;
    private int stock;

    public Producto(){}

    public Producto(String nombre){
        this.nombre = nombre;
    }
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public mostrarInformacion(){
        return "Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock + ". ";
    }

}
public class Tienda {

    private List <Producto> productos;
   
    public Tienda (){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto productos){
        productos.add(producto);
    }

    public void venderProducto(Producto productos){
        productos.remove(producto);
    }
    
}
