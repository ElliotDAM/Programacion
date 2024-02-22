package ies.abstracta;

import ies.interfaces.IRecomendable;

public abstract class ProductoRecomendableAbstract extends ProductoAbstract implements IRecomendable {

    public ProductoRecomendableAbstract(String nombre, float precio, String fechaEntrada, String identificador) {
        super(nombre, precio, fechaEntrada, identificador);
    }


    @Override
    public abstract boolean recomendarProducto();

    @Override
    public abstract int calcularPopularidad();
    
}
