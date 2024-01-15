package main.java.ies.puerto.EjercicioClase;

public class Triangulo extends Figura {
    
    public Triangulo(float base, float altura){
        super(base, altura);
    }
    @Override
    public float calcularArea(){
        return "Area= "+(getBase()*getAltura())/2;
    }
    
    @Override
    public String toString(){
        return "Base: "+getBase()+", altura: "+getAltura();
    }

}
