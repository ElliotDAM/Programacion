package ies.puerto.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Concesionario {
    static Set<Coche> coches;
    static ArrayList<Motocicleta> motos;
    static Map<String, Camion> camiones;
    static Map<String, Bicicleta> bicicletas;
    

    public Concesionario() {
        this.coches = new HashSet<>();
        this.motos = new ArrayList<>();
        this.camiones = new HashMap<>();
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

    public static boolean addCamion(Camion camion){
        if(!camiones.containsKey(camion.getMatricula())){
            camiones.put(camion.getMatricula(), camion);
            return true;
        }
        return true;
    }

    public static boolean addBicicleta(Bicicleta bicicleta){
        if(!bicicletas.containsKey(bicicleta.getMatricula())){
            bicicletas.put(bicicleta.getMatricula(), bicicleta);
            return true;
        }

        return true;
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

    public static boolean removeCamion(Camion camion){
        if(camiones.containsKey(camion.getMatricula())){
            camiones.remove(camion.getMatricula(), camion);
            return true;
        }
        return false;
    }
    
    public static boolean removeBicicleta(Bicicleta bicicleta){
        if(bicicletas.containsKey(bicicleta.getMatricula())){
            bicicletas.remove(bicicleta.getMatricula(), bicicleta);
            return true;
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

    public static Camion obtenerCamion(String matricula){

        return camiones.get(matricula);
    }

    public static Bicicleta obtenerBicicleta(String matricula){
        
       return bicicletas.get(matricula);
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
            velocidad += coche.getVelocidad();
        }

        return velocidad / cantidadCoches;
    }

    public static float velocidadMediaCamiones(){
        int velocidad = 0;
        int cantidadCamiones = coches.size();
        
        if(cantidadCamiones == 0){
            return 0;
        }

        for(Camion camion : camiones.values()){
            velocidad += camion.getVelocidad();
        }

        return (float) velocidad / cantidadCamiones;
    }

    public static float velocidadMediaBicicletas(){
        int velocidad = 0;
        int cantidadBicicletas = coches.size();

        if(cantidadBicicletas == 0){
            return 0;
        }

        for(Bicicleta bicicleta : bicicletas.values()){
            velocidad += bicicleta.getVelocidad();
        }

        return (float) velocidad / cantidadBicicletas;
    }

    public float velocidadMediaVehiculos(){
        
        float velocidadMediaCoches = velocidadMediaCoches();
        float velocidadMediaMotos = velocidadMediaMotocicletas();
        float velocidadMediaCamiones = velocidadMediaCamiones();
        float velocidadMediaBicicletas = velocidadMediaBicicletas();

        int cantidadVehiculos = coches.size() + motos.size() + camiones.size() + bicicletas.size();

        if(cantidadVehiculos == 0){
            return 0;
        }
        
        return (velocidadMediaCoches + velocidadMediaMotos + velocidadMediaCamiones + velocidadMediaBicicletas) / cantidadVehiculos;
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
