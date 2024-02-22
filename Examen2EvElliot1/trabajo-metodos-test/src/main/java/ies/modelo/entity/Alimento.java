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
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date fechaCaducidad = formato.parse(getFechaCaducidad());
            Date fechaActual = new Date();
            long diferenciaEnMillis = fechaCaducidad.getTime() - fechaActual.getTime();
            return (int) (diferenciaEnMillis / (1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            e.printStackTrace();
            return 0; // Considera manejar este caso de forma más adecuada
        }
    }

    @Override
    public boolean caducado(){
        return diasDisponible() < 0;
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
