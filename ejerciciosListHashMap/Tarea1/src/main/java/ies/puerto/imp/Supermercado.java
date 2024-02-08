package ies.puerto.imp;

import java.util.*;

public class Supermercado {
    static Set<Alimento> alimentos;
    static List<Electronica> electronicas;
    static Map<String, Souvenir> souvenirs;

    public Supermercado(){
        alimentos = new HashSet<>();
        electronicas = new ArrayList<>();
        souvenirs = new HashMap<>();

    }
    public boolean addAlimento(Alimento alimento){
        if(!alimentos.contains(alimento)){
            alimentos.add(alimento);
            return true;
        }
        return true;
    }

    public boolean removeAlimento(Alimento alimento){
        if(alimentos.contains(alimento)){
            alimentos.remove(alimento);
            return true;
        }
        return true;
    }

    public Alimento obtenerAlimento(String udi){

        for (Alimento alimento:alimentos) {
            if(alimento.getUdi().equals(udi)){
                return alimento;
            }
        }
        return null;
    }

    public boolean addElectronica(Electronica electronica){
        if(!electronicas.contains(electronica)){
            electronicas.add(electronica);
            return true;
        }
        return true;
    }

    public boolean removeElectronica(Electronica electronica){
        if(electronicas.contains(electronica)){
            electronicas.remove(electronica);
            return true;
        }
        return true;
    }

    public Electronica obtenerElectronica(String udi){

        for (Electronica electronica:electronicas) {
            if(electronica.getUdi().equals(udi)){
                return electronica;
            }
        }
        return null;
    }

    public boolean addSouvenir(Souvenir souvenir){
        if(!souvenirs.containsKey(souvenir)){
            souvenirs.put(souvenir.getUdi(),souvenir);
            return true;
        }
        return true;
    }

    public boolean removeSouvenir(Souvenir souvenir){
        if(souvenirs.containsKey(souvenir)){
            souvenirs.remove(souvenir.getUdi(), souvenir);
            return true;
        }
        return true;
    }

    public Souvenir obtenerSouvenir(String udi){
        for (Souvenir souvenir : souvenirs.values()) {
            if(souvenir.getUdi().equals(udi)){
                return souvenir;
            }
        }
        return null;
        
    }
//preguntar profe(duda resuelta)
    public List<Alimento> obtenerAlimentosCaducados(String udi){
        List<Alimento> alimentosCaducados = new ArrayList<>();

        for (Alimento alimento: alimentos){
            if(alimento.caducado(udi)){
                   alimentosCaducados.add(alimento);
            }
        }
        return alimentosCaducados;
    }

    public static String precioAlimentos(){


        for (Alimento alimento: alimentos) {
            return "Nombre: "+alimento.getNombre()+", precio: "+alimento.getPrecio();
        }

        return null;
    }

    public static String precioElectronica(){


        for (Electronica electronica: electronicas) {
            return "Nombre: "+electronica.getNombre()+", precio: "+electronica.getPrecio();
        }
        return null;
    }

    public static String precioSouvenir(){
        for (Souvenir souvenir: souvenirs.values()){
            return "Nombre: "+souvenir.getNombre()+", precio: "+souvenir.getPrecio();
        }

        return null;
    }

    public static void precioProductos(){
        //Mejorar esta parte, hay mas formas de enseñar productos
        String precioAlimentos = precioAlimentos();
        String precioElectronicas = precioElectronica();
        String precioSouvenirs = precioSouvenir();

        System.out.println(precioAlimentos);
        System.out.println(precioElectronicas);
        System.out.println(precioSouvenirs);
    }





}
