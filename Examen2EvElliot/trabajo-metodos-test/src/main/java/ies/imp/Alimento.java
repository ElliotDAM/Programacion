package ies.imp;

import ies.abstracta.ProductoFrescoAbstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Alimento extends ProductoFrescoAbstract {

    public Alimento(String nombre, float precio, String fechaEntrada, String identificador, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, identificador, fechaCaducidad);
    }


    @Override
    public int diasDisponible(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
        Date fechaActual = new Date();
        Date fechaEntrada = null;
        try {
            fechaEntrada = formato.parse(getFechaEntrada());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long fechaMillis = (fechaActual.getTime() - fechaEntrada.getTime());
        long diasDisponible = (fechaMillis / (1000*60*60*24));


        return (int) diasDisponible;
    }

    @Override
    public boolean caducado(){
        return diasDisponible() > 30;
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 1.35f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }


}
