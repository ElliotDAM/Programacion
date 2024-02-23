package ies.presentacion;


import java.util.Scanner;

import ies.modelo.entity.Alimento;
import ies.modelo.entity.Aparato;
import ies.modelo.entity.CuidadoPersonal;
import ies.modelo.entity.Souvenir;
import ies.negocio.*;


public class AppTienda {
    static Tienda tienda = new Tienda();
    static Scanner scanner = new Scanner(System.in);
    public static void menu(){
        System.out.println("Bienvenido a la tienda");
        System.out.println("Escoja la opcion con la que desea trabajar");
        System.out.println("1. Aniadir alimento");
        System.out.println("2. Eliminar alimento");
        System.out.println("3. Obtener alimento");
        System.out.println("4. Aniadir aparato");
        System.out.println("5. Eliminar aparato");
        System.out.println("6. Obtener aparato");
        System.out.println("7. Aniadir cuidado personal");
        System.out.println("8. Eliminar cuidado personal");
        System.out.println("9. Obtener cuidado personal");
        System.out.println("10. Aniadir souvenir");
        System.out.println("11. Eliminar souvenir");
        System.out.println("12. Obtener souvenir");
        System.out.println("13. Modificar alimento");
        System.out.println("14. Modificar aparato");
        System.out.println("15. Modificar cuidado personal");
        System.out.println("16. Modificar souvenir");
    }

    public static void opcionMenu(int opcion){

        switch (opcion){
            case 1:
                addAlimento();
                break;
            case 2:
                removeAlimento();
                break;
            case 3:
                obtenerAlimento();
                break;
            case 4:
                addAparato();
                break;
            case 5:
                removeAparato();
                break;
            case 6:
                obtenerAparato();
                break;
            case 7:
                addCuidadoPersonal();
                break;
            case 8:
                removeCuidadoPersonal();
                break;
            case 9:
                obtenerCuidadoPersonal();
                break;
            case 10:
                addSouvenir();
                break;
            case 11:
                removeSouvenir();
                break;
            case 12:
                obtenerSouvenir();
                break;
            case 13:
                modificarAlimento();
                break;
            case 14:
                modificarAparato();
                break;
            case 15:
                modificarCuidadoPersonal();
                break;
            case 16:
                modificarSouvenir();
                break;
            default:
                System.out.println("No se ha elegido una opcion valida. Intentelo de nuevo.");

        }
    }

    public static void main(String[] args) {
        
        tienda.addAlimento(new Alimento("Manzanas", 2.50f, "2024-01-09", "ALM001", "2024-01-15"));
        tienda.addAlimento(new Alimento("Leche", 1.99f, "2024-02-09", "ALM002", "2024-02-14"));
        tienda.addAlimento(new Alimento("Arroz", 3.75f, "2024-01-15", "ALM003", "2024-01-27"));

        tienda.addAparato(new Aparato("Televisor LED", 499.99f, "2024-02-09", "APA001"));
        tienda.addAparato(new Aparato("Smartphone", 799.99f, "2024-02-09", "APA002"));
        tienda.addAparato(new Aparato("Cafetera", 39.99f, "2024-02-09", "APA003"));

        tienda.addCuidadoPersonal(new CuidadoPersonal("Champú", 3.99f, "2024-02-09", "CUI001", 7));
        tienda.addCuidadoPersonal(new CuidadoPersonal("Crema hidratante", 5.49f, "2024-02-09", "CUI002", 8));
        tienda.addCuidadoPersonal(new CuidadoPersonal("Cepillo de dientes", 2.29f, "2024-02-09", "CUI003", 6));

        tienda.addSouvenir("SOU001", new Souvenir("Imán de nevera", 1.99f, "2024-02-09", "SOU001"));
        tienda.addSouvenir("SOU002", new Souvenir("Llavero", 0.99f, "2024-02-09", "SOU002"));
        tienda.addSouvenir("SOU003", new Souvenir("Taza de café", 3.49f, "2024-02-09", "SOU003"));
        
        int opcion;
        do{
            menu();
            opcion = scanner.nextInt();
            opcionMenu(opcion);

        }while(opcion != 0);
    }

    public static void addAlimento(){
        System.out.println("Introduzca el nombre del producto");
        String nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada(dd-mm-yyyy)");
        String fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca la fecha de caducidad");
        String fechaCaducidad = scanner.nextLine();scanner.nextLine();
        Alimento alimento = new Alimento(nombre, precio, fechaEntrada, identificador, fechaCaducidad);
        tienda.addAlimento(alimento);
    }

    public static void removeAlimento(){
      
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.removeAlimento(identificador);
    }

    public static void obtenerAlimento(){
        System.out.println("Introduce el identificador del alimento");
        String identificador = scanner.nextLine();
        tienda.obtenerAlimento(identificador);
    }

    public static void addAparato(){
        System.out.println("Introduzca el nombre del producto");
        String nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada(dd-mm-yyyy)");
        String fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        Aparato aparato = new Aparato(nombre, precio, fechaEntrada, identificador);
        tienda.addAparato(aparato);
    }

    public static void removeAparato(){
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.removeAparatos(identificador);
    }

    public static void obtenerAparato(){
        System.out.println("Introduce el identificador del aparato");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.obtenerAparato(identificador);
    }

    public static void addCuidadoPersonal(){
        System.out.println("Introduzca el nombre del producto");
        String nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada(dd-mm-yyyy)");
        String fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca su indice de popularidad");
        int popularidad = scanner.nextInt();
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(nombre, precio, fechaEntrada, identificador, popularidad);
        tienda.addCuidadoPersonal(cuidadoPersonal);
    }

    public static void removeCuidadoPersonal(){
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.removeCuidadoPersonal(identificador);
    }

    public static void obtenerCuidadoPersonal(){
        System.out.println("Introduce el identificador del alimento");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.obtenerCuidadoPersonal(identificador);
    }
    public static void addSouvenir(){
        System.out.println("Introduzca el nombre del producto");
        String nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada(dd-mm-yyyy)");
        String fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        Souvenir souvenir = new Souvenir(nombre, precio, fechaEntrada, identificador);
        tienda.addSouvenir(identificador, souvenir);
    }

    public static void removeSouvenir(){
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.removeSouvenir(identificador);
    }

    public static void obtenerSouvenir(){
        System.out.println("Introduce el identificador del alimento");
        String identificador = scanner.nextLine();scanner.nextLine();
        tienda.obtenerSouvenir(identificador);
    }

    public static void modificarAlimento(){
        String nombre = "";
        float precio = 0f;
        String fechaEntrada = "";
        String identificador = "";
        String fechaCaducidad = "";

        Alimento alimento = new Alimento(nombre, precio, fechaEntrada, identificador, fechaCaducidad);
        System.out.println("Introduzca el nuevo nombre del producto");
        nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el nuevo precio del producto");
        precio = scanner.nextFloat();
        System.out.println("Introduzca la nueva fecha de entrada(dd-mm-yyyy)");
        fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        identificador = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca la fecha de caducidad");
        fechaCaducidad = scanner.nextLine();scanner.nextLine();
        alimento.setNombre(nombre);
        alimento.setPrecio(precio);
        alimento.setFechaEntrada(fechaEntrada);
        alimento.setIdentificador(identificador);
        alimento.setFechaCaducidad(fechaCaducidad);

    }

    public static void modificarAparato(){
        String nombre = "";
        float precio = 0f;
        String fechaEntrada = "";
        String identificador = "";
        Aparato aparato = new Aparato(nombre, precio, fechaEntrada, identificador);
        System.out.println("Introduzca el nuevo nombre del producto");
        nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el nuevo precio del producto");
        precio = scanner.nextFloat();
        System.out.println("Introduzca la nueva fecha de entrada(dd-mm-yyyy)");
        fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        identificador = scanner.nextLine();scanner.nextLine();
        aparato.setNombre(nombre);
        aparato.setPrecio(precio);
        aparato.setFechaEntrada(fechaEntrada);
        aparato.setIdentificador(identificador);

    }

    public static void modificarCuidadoPersonal(){
        String nombre = "";
        float precio = 0f;
        String fechaEntrada = "";
        String identificador = "";
        int popularidad = 0;
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(nombre, precio, fechaEntrada, identificador, popularidad);
        System.out.println("Introduzca el nuevo nombre del producto");
        nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el nuevo precio del producto");
        precio = scanner.nextFloat();
        System.out.println("Introduzca la nueva fecha de entrada(dd-mm-yyyy)");
        fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        identificador = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca la popularidad");
        popularidad = scanner.nextInt();
        cuidadoPersonal.setNombre(nombre);
        cuidadoPersonal.setPrecio(precio);
        cuidadoPersonal.setFechaEntrada(fechaEntrada);
        cuidadoPersonal.setIdentificador(identificador);
        cuidadoPersonal.setPopularidad(popularidad);

    }

    public static void modificarSouvenir(){
        String nombre = "";
        float precio = 0f;
        String fechaEntrada = "";
        String identificador = "";
        Souvenir souvenir = new Souvenir(nombre, precio, fechaEntrada, identificador);
        System.out.println("Introduzca el nuevo nombre del producto");
        nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el nuevo precio del producto");
        precio = scanner.nextFloat();
        System.out.println("Introduzca la nueva fecha de entrada(dd-mm-yyyy)");
        fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        identificador = scanner.nextLine();scanner.nextLine();
        souvenir.setNombre(nombre);
        souvenir.setPrecio(precio);
        souvenir.setFechaEntrada(fechaEntrada);
        souvenir.setIdentificador(identificador);

    }










}
