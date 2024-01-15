package main.java.ies.puerto.EjercicioClase;

public class Rectangulo extends Figura{
    
    public Rectangulo(){}

    public Rectangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    @Deprecated(since = "4.5", forRemoval = true)
    public float calcularArea() {
        return area;
    }

    public float area(){
        return getBase() * getAltura();
    }

    public float calculo(float base, float altura, float profundidad){
        float resultado = 0f;

        if(base != 0f && altura != 0f){
            resultado = base * altura;
            if(profundidad != 0f){
                resultado = resultado * profundidad;
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "base: "+getBase()+", altura: "+getAltura();
    }
    
}
