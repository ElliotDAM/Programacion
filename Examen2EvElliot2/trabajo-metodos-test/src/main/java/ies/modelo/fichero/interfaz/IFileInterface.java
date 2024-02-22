package ies.modelo.fichero.interfaz;


import java.util.List;

import ies.modelo.entity.Articulo;


public interface IFileInterface {
    public List<Articulo> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
}
