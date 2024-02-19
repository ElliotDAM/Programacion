package ies.App;

import ies.imp.*;

import java.util.Scanner;

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
        tienda.removeAlimento(alimento);
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
        System.out.println("Introduzca el nombre del producto");
        String nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada(dd-mm-yyyy)");
        String fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        Aparato aparato = new Aparato(nombre, precio, fechaEntrada, identificador);
        tienda.removeAparatos(aparato);
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
        tienda.removeCuidadoPersonal(cuidadoPersonal);
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
        System.out.println("Introduzca el nombre del producto");
        String nombre = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Introduzca la fecha de entrada(dd-mm-yyyy)");
        String fechaEntrada = scanner.nextLine();scanner.nextLine();
        System.out.println("Introduzca el identificador del producto");
        String identificador = scanner.nextLine();scanner.nextLine();
        Souvenir souvenir = new Souvenir(nombre, precio, fechaEntrada, identificador);
        tienda.removeSouvenir(souvenir);
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
