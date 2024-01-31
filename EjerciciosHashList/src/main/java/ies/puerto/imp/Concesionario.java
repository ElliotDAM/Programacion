package ies.puerto.imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Concesionario {
    static Set<Coche> coches = new HashSet<>();
    static ArrayList<Motocicleta> motos;

    public Concesionario() {
        this.coches = new HashSet<>();
        this.motos = new ArrayList<>();
    }

    public static boolean addMotocicleta(Motocicleta motocicleta){
        
        if(!motos.contains(motocicleta)){
            return motos.add(motocicleta);
        }
        return false;
    }

    public static boolean addCoche(Coche coche){

        if(!coches.contains(coche)){
            return coches.add(coche);
        }
        return false;
    }

    public static boolean removeMotocicleta(Motocicleta motocicleta){
        
        if(motos.contains(motocicleta)){
            return motos.remove(motocicleta);
        }
        return false;
    }

    public static boolean removeCoche(Coche coche){
        if(coches.contains(coche)){
            return coches.remove(coche);
        }
        return false;
    }

    public static Motocicleta obtenerMotocicleta(String matricula){
        
       for (Motocicleta motocicleta : motos) {
        if(motocicleta.getMatricula().equals(matricula)){
            return motocicleta;
        }
       }
        return null;
    }

    public static Coche obtenerCoche(String matricula){
        
        for (Coche coche : coches) {
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    public static float velocidadMediaMotocicletas(){
        int velocidad = 0;
        int cantidadMotos = motos.size();

        if(cantidadMotos == 0){
            return 0;
        }

        for (Motocicleta motocicleta : motos) {
            velocidad += motocicleta.getVelocidad();
        }

        return velocidad / cantidadMotos;
    }

    public static float velocidadMediaCoches(){
        int velocidad = 0;
        int cantidadCoches = coches.size();

        if(cantidadCoches == 0){
            return 0;
        }

        for (Coche coche : coches) {
            velocidad = coche.getVelocidad();
        }

        return velocidad / cantidadCoches;
    }

    public float velocidadMediaVehiculos(){
        
        float velocidadMediaCoches = velocidadMediaCoches();
        float velocidadMediaMotos = velocidadMediaMotocicletas();
        int cantidadVehiculos = coches.size() + motos.size();

        if(cantidadVehiculos == 0){
            return 0;
        }
        
        return (velocidadMediaCoches + velocidadMediaMotos) / cantidadVehiculos;
    }

    public static Set<Coche> getCoches() {
        return coches;
    }

    public static void setCoches(Set<Coche> coches) {
        Concesionario.coches = coches;
    }

    public static ArrayList<Motocicleta> getMotos() {
        return motos;
    }

    public static void setMotos(ArrayList<Motocicleta> motos) {
        Concesionario.motos = motos;
    }

    @Override
    public String toString() {
        return "Concesionario []";
    }
}
