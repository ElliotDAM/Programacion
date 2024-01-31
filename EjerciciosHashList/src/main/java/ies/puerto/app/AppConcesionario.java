package ies.puerto.app;

import ies.puerto.imp.Coche;
import ies.puerto.imp.Concesionario;
import ies.puerto.imp.Motocicleta;

public class AppConcesionario {
    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario();
        //Se incluyen varios coches y motos para la realizacion de pruebas
        concesionario.addCoche(new Coche("Toyota", "Corolla", "ABC123", 60));
        concesionario.addCoche(new Coche("Honda", "Civic", "XYZ789", 75));
        concesionario.addCoche(new Coche("Ford", "Mustang", "DEF456", 100));
        concesionario.addCoche(new Coche("Chevrolet", "Impala", "GHI789", 80));
        concesionario.addCoche(new Coche("Volkswagen", "Golf", "JKL012", 65));

        concesionario.addMotocicleta(new Motocicleta("Harley-Davidson", "Sportster", "MNO345", 50));
        concesionario.addMotocicleta(new Motocicleta("Yamaha", "YZF R6", "PQR678", 90));
        concesionario.addMotocicleta(new Motocicleta("Ducati", "Monster", "STU901", 70));
        concesionario.addMotocicleta(new Motocicleta("Suzuki", "GSX-R750", "VWX234", 80));
        concesionario.addMotocicleta(new Motocicleta("Kawasaki", "Ninja", "ZAB567", 85));
        
        //Recorremos todos los coches y motos para obtener sus datos
        System.out.println("Informacion sobre los coches:");
        for (Coche coche : concesionario.getCoches()) {
                System.out.println(coche);        
        }

        System.out.println("Informacion sobre las motocicletas: ");
        for (Motocicleta motocicleta : concesionario.getMotos()) {
            System.out.println(motocicleta);
        }

        //Obtenemos las velocidades medias
        System.out.println("Velocidad media de coches:"+concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de motocicletas: "+concesionario.velocidadMediaMotocicletas());
        System.out.println("Velocidad media de vehiculos: "+concesionario.velocidadMediaVehiculos());

        //Se busca coche y moto por matricula
        Coche cocheObtenido = concesionario.obtenerCoche("XYZ789");
        Motocicleta motocicletaObtenida = concesionario.obtenerMotocicleta("PQR678");
        System.out.println("Buscar coche por matricula: "+cocheObtenido);
        System.out.println("Buscar moto por matricula: "+motocicletaObtenida);

        //Eliminando una moto y un coche
        concesionario.removeCoche(cocheObtenido);
        concesionario.removeMotocicleta(motocicletaObtenida);



    }
}
