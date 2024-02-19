package ies.imp;

import ies.abstracta.ProductoAbstract;

import java.util.*;

public class Tienda {
    static List<Alimento> alimentos;
    static List<Aparato> aparatos;
    static Set<CuidadoPersonal> cuidadosPersonales;
    static Map<String, Souvenir> souvenirs;

    public Tienda(){
        alimentos = new ArrayList<>();
        aparatos = new ArrayList<>();
        cuidadosPersonales = new HashSet<>();
        souvenirs = new HashMap<>();
    }

    public boolean addAlimento(Alimento alimento){
        if(!alimentos.contains(alimento)){
            return alimentos.add(alimento);
        }
        return true;
    }

    public boolean removeAlimento(Alimento alimento){
        if(alimentos.contains(alimento)){
            return alimentos.remove(alimento);
        }
        return true;
    }

    public Alimento obtenerAlimento(String identificador){
        for (Alimento alimento: alimentos) {
            if(alimento.getIdentificador().equals(identificador)){
                return alimento;
            }
        }
        return null;
    }
    public boolean addAparato(Aparato aparato){
        if(!aparatos.contains(aparato)){
            return aparatos.add(aparato);
        }
        return true;
    }

    public boolean removeAparatos(Aparato aparato){
        if(aparatos.contains(aparato)){
            return aparatos.remove(aparato);
        }
        return true;
    }

    public Aparato obtenerAparato(String identificador){
        for (Aparato aparato: aparatos) {
            if(aparato.getIdentificador().equals(identificador)){
                return aparato;
            }
        }
        return null;
    }
    public boolean addCuidadoPersonal(CuidadoPersonal cuidado){
        if(!cuidadosPersonales.contains(cuidado)){
            return cuidadosPersonales.add(cuidado);
        }
        return true;
    }

    public boolean removeCuidadoPersonal(CuidadoPersonal cuidado){
        if(cuidadosPersonales.contains(cuidado)){
            return cuidadosPersonales.remove(cuidado);
        }
        return true;
    }

    public CuidadoPersonal obtenerCuidadoPersonal(String identificador){
        for (CuidadoPersonal cuidado: cuidadosPersonales) {
            if(cuidado.getIdentificador().equals(identificador)){
                return cuidado;
            }
        }
        return null;
    }

    public boolean addSouvenir(String identificador, Souvenir souvenir){
        if(!souvenirs.containsKey(souvenir)){
            souvenirs.put(identificador, souvenir);
            return true;
        }
        return true;
    }

    public boolean removeSouvenir(Souvenir souvenir){
        if(souvenirs.containsKey(souvenir)){
            souvenirs.remove(souvenir);
            return true;
        }
        return true;
    }

    public Souvenir obtenerSouvenir(String identificador){
        for (Souvenir souvenir:souvenirs.values()) {
            if(souvenir.getIdentificador().equals(identificador)){
                return souvenir;
            }
        }
        return null;
    }

    public static float precioTotalProductos(){
        return 0f;
    }

    public static Set<CuidadoPersonal> mostrarProductosCuidadoPopulares(){
        Set<CuidadoPersonal> cuidadosPopulares = new HashSet<>();

        for (CuidadoPersonal cuidadoPersonal:cuidadosPersonales) {
            if(cuidadoPersonal.recomendarProducto()){
                cuidadosPopulares.add(cuidadoPersonal);
                return cuidadosPopulares;
            }
        }
        return null;
    }

    public static int cantidadAlimentos(){
      return alimentos.size();
    }

    public static int cantidadAparatos(){
        return aparatos.size();
    }

    public static int cantidadCuidadosPersonales(){
        return cuidadosPersonales.size();
    }

    public static int cantidadSouvenirs(){
        return souvenirs.size();
    }

}
