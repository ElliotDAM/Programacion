package ies.puerto.app;

import java.util.Scanner;

import ies.puerto.imp.Bicicleta;
import ies.puerto.imp.Camion;
import ies.puerto.imp.Coche;
import ies.puerto.imp.Concesionario;
import ies.puerto.imp.Motocicleta;

public class AppConcesionario {
    static Scanner scanner = new Scanner(System.in);
    static Concesionario concesionario = new Concesionario();

    public static void menu() {
        System.out.println("------ Menú de Concesionario ------");
        System.out.println("1. Añadir Coche");
        System.out.println("2. Añadir Motocicleta");
        System.out.println("3. Añadir Camión");
        System.out.println("4. Añadir Bicicleta");
        System.out.println("5. Mostrar Información");
        System.out.println("6. Calcular Velocidades Medias");
        System.out.println("7. Buscar Vehículo por Matrícula");
        System.out.println("8. Eliminar Vehículo por Matrícula");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void opcionMenu(int opcion) {
        switch (opcion) {
            case 1:
            addCoche();
            break;
        case 2:
            addMotocicleta();
            break;
        case 3:
           addCamion();
            break;
        case 4:
            addBicicleta();
            break;
        case 5:
            mostrarInformacion();
            break;
        case 6:
            calcularVelocidadesMedias();
            break;
        case 7:
            buscarVehiculoPorMatricula();
            break;
        case 8:
            eliminarVehiculoPorMatricula();
            break;
        case 0:
            System.out.println("¡Adiós!");
            break;
        default:
            System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }
    public static void main(String[] args) {
        
        int opcion;
        //Se incluyen varios coches y motos para la realizacion de pruebas
        Concesionario.addCoche(new Coche("Toyota", "Corolla", "ABC123", 60));
        Concesionario.addCoche(new Coche("Honda", "Civic", "XYZ789", 75));
        Concesionario.addCoche(new Coche("Ford", "Mustang", "DEF456", 100));
        Concesionario.addCoche(new Coche("Chevrolet", "Impala", "GHI789", 80));
        Concesionario.addCoche(new Coche("Volkswagen", "Golf", "JKL012", 65));

        Concesionario.addMotocicleta(new Motocicleta("Harley-Davidson", "Sportster", "MNO345", 50));
        Concesionario.addMotocicleta(new Motocicleta("Yamaha", "YZF R6", "PQR678", 90));
        Concesionario.addMotocicleta(new Motocicleta("Ducati", "Monster", "STU901", 70));
        Concesionario.addMotocicleta(new Motocicleta("Suzuki", "GSX-R750", "VWX234", 80));
        Concesionario.addMotocicleta(new Motocicleta("Kawasaki", "Ninja", "ZAB567", 85));
        
        //Recorremos todos los coches y motos para obtener sus datos

        //Obtenemos las velocidades medias
        System.out.println("Velocidad media de coches:"+Concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de motocicletas: "+Concesionario.velocidadMediaMotocicletas());
        System.out.println("Velocidad media de vehiculos: "+concesionario.velocidadMediaVehiculos());

        //Se busca coche y moto por matricula
        Coche cocheObtenido = Concesionario.obtenerCoche("XYZ789");
        Motocicleta motocicletaObtenida = Concesionario.obtenerMotocicleta("PQR678");
        System.out.println("Buscar coche por matricula: "+cocheObtenido);
        System.out.println("Buscar moto por matricula: "+motocicletaObtenida);

        //Eliminando una moto y un coche
        Concesionario.removeCoche(cocheObtenido);
        Concesionario.removeMotocicleta(motocicletaObtenida);

        do{
            menu();
            opcion = scanner.nextInt();
            opcionMenu(opcion);
        }while (opcion != 0);
        

    }

    public static void addCoche(){
        System.out.println("Introduce la marca:");
        String marca = scanner.next();
        System.out.println("Introduce el modelo:");
        String modelo = scanner.next();
        System.out.println("Introduce la matrícula:");
        String matricula = scanner.next();
        System.out.println("Introduce la velocidad máxima:");
        int velocidad = scanner.nextInt();

        Coche coche = new Coche(marca, modelo, matricula, velocidad);
        if (Concesionario.addCoche(coche)) {
            System.out.println("Coche añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir el coche. ¡Ya existe!");
        }   
    }

    public static void addMotocicleta(){

        System.out.println("Introduce la marca:");
        String marca = scanner.next();
        System.out.println("Introduce el modelo:");
        String modelo = scanner.next();
        System.out.println("Introduce la matrícula:");
        String matricula = scanner.next();
        System.out.println("Introduce la velocidad máxima:");
        int velocidad = scanner.nextInt();

        Motocicleta motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);
        if (Concesionario.addMotocicleta(motocicleta)) {
            System.out.println("Motocicleta añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir la motocicleta. ¡Ya existe!");
        }   
    }

    public static void addCamion(){
        
        System.out.println("Introduce la marca:");
        String marca = scanner.next();
        System.out.println("Introduce el modelo:");
        String modelo = scanner.next();
        System.out.println("Introduce la matrícula:");
        String matricula = scanner.next();
        System.out.println("Introduce la velocidad máxima:");
        int velocidad = scanner.nextInt();

        Camion camion = new Camion(marca, modelo, matricula, velocidad);
        if (Concesionario.addCamion(camion)) {
            System.out.println("Camión añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir el camión. ¡Ya existe!");
        }
    }

    public static void addBicicleta(){

        System.out.println("Introduce la marca:");
        String marca = scanner.next();
        System.out.println("Introduce el modelo:");
        String modelo = scanner.next();
        System.out.println("Introduce la matrícula:");
        String matricula = scanner.next();
        System.out.println("Introduce la velocidad máxima:");
        int velocidad = scanner.nextInt();

        Bicicleta bicicleta = new Bicicleta(marca, modelo, matricula, velocidad);
        if (Concesionario.addBicicleta(bicicleta)) {
            System.out.println("Bicicleta añadida correctamente.");
        } else {
            System.out.println("No se pudo añadir la bicicleta. ¡Ya existe!");
        }
    }

    public static void buscarVehiculoPorMatricula(){

        System.out.println("Introduce la matrícula:");
        String matricula = scanner.next();

        Coche coche = Concesionario.obtenerCoche(matricula);
        Motocicleta motocicleta = Concesionario.obtenerMotocicleta(matricula);
        Camion camion = Concesionario.obtenerCamion(matricula);
        Bicicleta bicicleta = Concesionario.obtenerBicicleta(matricula);

        if (coche != null) {
            System.out.println("Coche encontrado: " + coche);
        } else if (motocicleta != null) {
            System.out.println("Motocicleta encontrada: " + motocicleta);
        } else if (camion != null) {
            System.out.println("Camión encontrado: " + camion);
        } else if (bicicleta != null) {
            System.out.println("Bicicleta encontrada: " + bicicleta);
        } else {
            System.out.println("Vehículo con matrícula " + matricula + " no encontrado.");
        }
    }

    public static void eliminarVehiculoPorMatricula(){
        
        System.out.println("Introduce la matrícula:");
        String matricula = scanner.next();

        Coche coche = Concesionario.obtenerCoche(matricula);
        Motocicleta motocicleta = Concesionario.obtenerMotocicleta(matricula);
        Camion camion = Concesionario.obtenerCamion(matricula);
        Bicicleta bicicleta = Concesionario.obtenerBicicleta(matricula);

        if (coche != null) {
            Concesionario.removeCoche(coche);
            System.out.println("Coche eliminado correctamente.");
        } else if (motocicleta != null) {
            Concesionario.removeMotocicleta(motocicleta);
            System.out.println("Motocicleta eliminada correctamente.");
        } else if (camion != null) {
            Concesionario.removeCamion(camion);
            System.out.println("Camión eliminado correctamente.");
        } else if (bicicleta != null) {
            Concesionario.removeBicicleta(bicicleta);
            System.out.println("Bicicleta eliminada correctamente.");
        } else {
            System.out.println("Vehículo con matrícula " + matricula + " no encontrado.");
        }
    }

    public static void mostrarInformacion(){

        System.out.println("Informacion sobre los coches:");
        for (Coche coche : Concesionario.getCoches()) {
                System.out.println(coche);        
        }

        System.out.println("Informacion sobre las motocicletas: ");
        for (Motocicleta motocicleta : Concesionario.getMotos()) {
            System.out.println(motocicleta);
        }

        System.out.println("Informacion sobre los camiones:");
        for (Camion camion : concesionario.getCamiones().values()) {
            System.out.println(camion);
        }

        System.out.println("Informacion sobre las bicicletas");
        for (Bicicleta bicicleta : concesionario.getBicicletas().values()) {
            System.out.println(bicicleta);
        }

    }

    public static void calcularVelocidadesMedias(){

        System.out.println("Velocidad media de coches:"+Concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de motocicletas: "+concesionario.velocidadMediaMotocicletas());
        System.out.println("Velocidad media de camiones: "+concesionario.velocidadMediaCamiones());
        System.out.println("Velocidad media de bicicletas: "+concesionario.velocidadMediaBicicletas());
        System.out.println("Velocidad media de vehiculos: "+concesionario.velocidadMediaVehiculos());
    }

    
}
