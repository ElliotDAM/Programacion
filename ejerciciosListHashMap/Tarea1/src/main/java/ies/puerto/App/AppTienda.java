package ies.puerto.App;

import ies.puerto.abstracta.ProductoAbstract;
import ies.puerto.imp.Alimento;
import ies.puerto.imp.Electronica;
import ies.puerto.imp.Souvenir;
import ies.puerto.imp.Supermercado;

import java.util.Scanner;

public class AppTienda {
static Supermercado supermercado = new Supermercado();
static Scanner scanner = new Scanner(System.in);

    public static void menu(){
        System.out.println("Bienvenido a la tienda");
        System.out.println("Teclee el numero correspondiente a la accion que desea realizar:");
        System.out.println("1. Aniadir alimento");
        System.out.println("2. Aniadir electronica");
        System.out.println("3. Aniadir souvenir");
        System.out.println("4. Eliminar alimento");
        System.out.println("5. Eliminar electronica");
        System.out.println("6. Elminiar souvenir");
        System.out.println("7. Mostrar producto por udi");
        System.out.println("8. Modificar producto");
    }

    public static void opcion(int opcion){

        switch(opcion){
            case 1:
                addAlimento();
                break;
            case 2:
                //Metodo añadir electronica
                break;
            case 3:
                //Metodo añadir souvenir
                break;
            case 4:
                //Metodo eliminar alimento
                break;
            case 5:
                //Metodo eliminar electronica
                break;
            case 6:
                //Metodo eliminar souvenir
                break;
            case 7:
                //Metodo mostrar producto por udi
                break;
            case 8:
                //Metodo modificar producto
                break;
            default:
                System.out.println("No se ha seleccionado una opcion valida.");
                break;
        }
    }
    public static void main(String[] args) {

        int opcion;

        do{
            menu();
            opcion = scanner.nextInt();
            opcion(opcion);
        } while (opcion != 0);
    }

    public static void addAlimento(){
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca su precio");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada");
        String fechaEntrada = scanner.nextLine();
        System.out.println("Introduzca su udi");
        String udi = scanner.nextLine();

       Alimento alimento = new Alimento(nombre, precio, fechaEntrada, udi);
       supermercado.addAlimento(alimento);
       System.out.println("Alimento aniadido correctamente.");
    }

    public static void addElectronica(){
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca su precio");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada");
        String fechaEntrada = scanner.nextLine();
        System.out.println("Introduzca su udi");
        String udi = scanner.nextLine();

        Electronica electronica = new Electronica(nombre, precio, fechaEntrada, udi);
        supermercado.addElectronica(electronica);
        System.out.println("Electronica aniadida correctamente");
    }

    public static void addSouvenir(){
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca su precio");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada");
        String fechaEntrada = scanner.nextLine();
        System.out.println("Introduzca su udi");
        String udi = scanner.nextLine();

        Souvenir souvenir = new Souvenir(nombre, precio, fechaEntrada, udi);
        supermercado.addSouvenir(souvenir);
        System.out.println("Souvenir aniadida correctamente");
    }

    public static void removeAlimento(){
        System.out.println("Introduzca el UDI del alimento que desea eliminar:");
        String udi = scanner.next();
        Alimento alimento = supermercado.obtenerAlimento(udi);
        if(alimento != null){
            if(supermercado.removeAlimento(alimento)){
                System.out.println("Alimento eliminado correctamente.");
            } else {
                System.out.println("Error al eliminar el alimento.");
            }
        } else {
            System.out.println("No se encontró ningún alimento con el UDI especificado.");
        }
    }
    
    public static void removeElectronica(){
        System.out.println("Introduzca el UDI de la electrónica que desea eliminar:");
        String udi = scanner.next();
        Electronica electronica = supermercado.obtenerElectronica(udi);
        if(electronica != null){
            if(supermercado.removeElectronica(electronica)){
                System.out.println("Electrónica eliminada correctamente.");
            } else {
                System.out.println("Error al eliminar la electrónica.");
            }
        } else {
            System.out.println("No se encontró ninguna electrónica con el UDI especificado.");
        }
    }
    
    public static void removeSouvenir(){
        System.out.println("Introduzca el UDI del souvenir que desea eliminar:");
        String udi = scanner.next();
        Souvenir souvenir = supermercado.obtenerSouvenir(udi);
        if(souvenir != null){
            if(supermercado.removeSouvenir(souvenir)){
                System.out.println("Souvenir eliminado correctamente.");
            } else {
                System.out.println("Error al eliminar el souvenir.");
            }
        } else {
            System.out.println("No se encontró ningún souvenir con el UDI especificado.");
        }
    }
    
    public static void modificarProducto(ProductoAbstract producto) {
        System.out.println("Introduzca el nuevo nombre:");
        String nombre = scanner.nextLine(); // Lee el nuevo nombre
        producto.setNombre(nombre);

        System.out.println("Introduzca el nuevo precio:");
        float precio = scanner.nextFloat(); // Lee el nuevo precio
        producto.setPrecio(precio);

        System.out.println("Introduzca la nueva fecha de entrada (YYYY-MM-DD):");
        scanner.nextLine(); // Consumir nueva línea pendiente
        String fechaEntrada = scanner.nextLine(); // Lee la nueva fecha de entrada
        producto.setFechaEntrada(fechaEntrada);

        System.out.println("Producto modificado correctamente.");
    }

}
