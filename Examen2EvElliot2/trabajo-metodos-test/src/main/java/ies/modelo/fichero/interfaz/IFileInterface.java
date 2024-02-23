package ies.modelo.fichero.interfaz;


import java.util.List;

import ies.modelo.abstracta.ProductoAbstract;


public interface IFileInterface {
    public List<ProductoAbstract> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
}
