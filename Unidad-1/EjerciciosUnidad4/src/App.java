public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Coche miCocheMatricula;
    static Bicicleta miBicicleta;
    public static void main(String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        miCoche.miColor();
        System.out.println(miCoche.toString());
        //miCoche.apagar();
        miCocheColor = new Coche("Rojo");
        miCocheColor.mover();
        miCocheColor.miColor();
        System.out.println(miCocheColor.toString());

        miCocheMatricula = new Coche("Azul", "TF1965AK");
        miCocheMatricula.mover();
        miCocheMatricula.miColor();
        System.out.println(miCocheMatricula.toString());


        miBicicleta = new Bicicleta("L", "Negra");
        miBicicleta.miColor();
        miBicicleta.mover();
        miBicicleta.toString();
        System.out.println(miBicicleta.toString());
    }
}
