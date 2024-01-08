public class Coche extends Motor {

    public Coche(String color) {
        super(color);
    }

    public Coche(){
        super();
    }

    public Coche(String color, String matricula){
        super(color,matricula);
    }

    @Override
    public String toString(){
        String mensaje = "";
        //return "Yo soy un Coche, y mi color es: "+getColor();
        if(getColor() != null){
            mensaje = "mi color es: "+getColor();
        }

        if(getMatricula() != null){
            mensaje += ", mi matricula es: "+getMatricula();
        }
        return mensaje;
    }

    
    
}
