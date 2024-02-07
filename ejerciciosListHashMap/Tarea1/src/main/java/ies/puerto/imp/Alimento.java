package ies.puerto.imp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ies.puerto.abstracta.ProductoAbstract;

public class Alimento extends ProductoAbstract{


    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 0.23f;
    }
//preguntar profe
    @Override
    public int cantidadDisponible() {

        return 0;
    }

    public static int diasDisponible(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        
        try {
            Date fechaEntrada = formato.parse(getFechaEntrada());
            Date fechaActual = new Date();
            long diferenciaMillis = fechaActual.getTime() - fechaEntrada.getTime();
            return (int) (diferenciaMillis / (1000 * 60 * 60 * 24));
        } catch (ParseException parseException) {
            System.out.println("No se ha introducido o no se reconoce la fecha de entrada. ");
            return 0;//return -1;
        }

        
        
    }

    public static boolean caducado(){
        return diasDisponible() > 30;
        
    }
}