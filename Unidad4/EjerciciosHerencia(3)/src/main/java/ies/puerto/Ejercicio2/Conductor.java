public class Conductor extends Persona{
    Coche coche;
    Motocicleta moto;
    
    public Conductor(){}

    public Conductor(String nombre, int edad, String dni, Coche coche, Motocicleta moto){
        super(nombre, edad, dni);
        this.coche = coche;
        this.moto = moto;
    }

    public String getcoche(){
    return coche;
    }

    public void setCoche(Coche coche){
        this.coche = coche;
    }

    public String getMoto(){
        return moto;
    }

    public void setMoto(Motocicleta moto){
        this.moto = moto;
    }

   


    
}
