public class Especie extends Animal{

    private String nombreEspecie;

    public Especie(){}

    public Especie(String nombreEspecie,String nombre, int chip){
        super(nombre, chip);
        this.nombreEspecie = nombreEspecie;
    }

    public Especie(String nombre, int chip){
        super(nombre, chip);
    }



}