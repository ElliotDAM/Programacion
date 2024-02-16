package es.ies.puerto.negocio.abstractas;

import java.util.List;

import es.ies.puerto.modelo.entity.Articulo;

public abstract class TiendaNegocio {

    FileCsv fileCsv;

    public TiendaNegocio(){
        
    }

    public boolean buscarArticulo(Articulo articulo, List<Articulo> articulos){
        if(articulos.contains(articulo)){
            return true;
        }

        return false;

    }
    
}
