package ies.puerto.Utilidades;

public class UtilidadesCal {
    private int numero1;
    private int numero2;

    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int division(int numero1, int numero2){
        return (numero1 / numero2);
    }

    @Override
    public String toString() {
        return "La suma es "+suma(numero1, numero2)+", la resta es: "+resta(numero1, numero2)+", la multiplicacion es: "+multiplicacion(numero1, numero2)+" y la division es: "+division(numero1, numero2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UtilidadesCal other = (UtilidadesCal) obj;
        if (numero1 != other.numero1)
            return false;
        if (numero2 != other.numero2)
            return false;
        return true;
    }

}
