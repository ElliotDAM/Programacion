package ies.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ies.modelo.entity.Alimento;
import ies.modelo.entity.Aparato;
import ies.modelo.entity.CuidadoPersonal;
import ies.modelo.entity.Souvenir;

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

    public boolean removeAlimento(String id){
        for (Alimento alimento : alimentos) {
            if(alimento.getIdentificador().equals(id)){
                return alimentos.remove(alimento);
            }
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

    public boolean removeAparatos(String id, Aparato aparato){
        for (Alimento alimento : alimentos) {
            if(alimento.getIdentificador().equals(id)){
                return alimentos.remove(alimento);
            }
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

    public boolean removeCuidado(String id, CuidadoPersonal cuidado){
        if(cuidado.getIdentificador().equals(id)){
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

    public static float calcularPrecioTotalAlimentos() {
        float precioTotal = 0f;
        for (Alimento alimento : alimentos) {
            if (!alimento.caducado()) { 
                precioTotal += alimento.precioMaximo();
            }
        }
        return precioTotal;
    }
    
    public static float calcularPrecioTotalAparatos() {
        float precioTotal = 0f;
        for (Aparato aparato : aparatos) {
            precioTotal += aparato.precioMaximo();
        }
        return precioTotal;
    }
    
    public static float calcularPrecioTotalCuidadosPersonales() {
        float precioTotal = 0f;
        for (CuidadoPersonal cuidado : cuidadosPersonales) {
            precioTotal += cuidado.precioMaximo();
        }
        return precioTotal;
    }
    
    public static float calcularPrecioTotalSouvenirs() {
        float precioTotal = 0f;
        for (Souvenir souvenir : souvenirs.values()) {
            precioTotal += souvenir.precioMaximo();
        }
        return precioTotal;
    }

    public static float precioTotalProductos(){
        return calcularPrecioTotalAlimentos()  + calcularPrecioTotalAparatos() +
        calcularPrecioTotalCuidadosPersonales() + calcularPrecioTotalSouvenirs();
    }

    public float calcularGananciaProductos(){
        float gananciaTotal = 0f;
    
        for (Alimento alimento : alimentos) {
            if (!alimento.caducado()) {
                gananciaTotal += alimento.precioMaximo() - alimento.getPrecio();
            }
        }
        
        for (Aparato aparato : aparatos) {
            gananciaTotal += aparato.precioMaximo() - aparato.getPrecio();
        }
        
        for (CuidadoPersonal cuidado : cuidadosPersonales) {
            gananciaTotal += cuidado.precioMaximo() - cuidado.getPrecio();
        }
        
        for (Souvenir souvenir : souvenirs.values()) {
            gananciaTotal += souvenir.precioMaximo() - souvenir.getPrecio();
        }
        
        return gananciaTotal;
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
    
    public void mostrarCantidadProductosDisponibles() {
        System.out.println("Cantidad de productos disponibles:");
        System.out.println("Alimentos: " + alimentos.size());
        System.out.println("Aparatos: " + aparatos.size());
        System.out.println("Cuidados Personales: " + cuidadosPersonales.size());
        System.out.println("Souvenirs: " + souvenirs.size());
    }

}
