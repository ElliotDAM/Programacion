package ies.puerto.Ejercicio2;

public class Conductor extends ies.puerto.Ejercicio1.Persona{
    Coche coche;
    Motocicleta moto;
    
    public Conductor(){}

    public Conductor(String nombre, int edad, String dni, Coche coche, Motocicleta moto){
        super(nombre, edad, dni);
        this.coche = coche;
        this.moto = moto;
    }

    public Coche getcoche(){
    return coche;
    }

    public void setCoche(Coche coche){
        this.coche = coche;
    }

    public Motocicleta getMoto(){
        return moto;
    }

    public void setMoto(Motocicleta moto){
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "Conductor [coche=" + coche + ", moto=" + moto + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conductor other = (Conductor) obj;
        if (coche == null) {
            if (other.coche != null)
                return false;
        } else if (!coche.equals(other.coche))
            return false;
        if (moto == null) {
            if (other.moto != null)
                return false;
        } else if (!moto.equals(other.moto))
            return false;
        return true;
    }

   


    
}
