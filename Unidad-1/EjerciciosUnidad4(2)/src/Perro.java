public class Perro extends Especie{

    public Perro(String nombre, int chip){
        super(nombre, chip);
    }

    @Override
    public String suSonido(){
        return "guau";
    }
}