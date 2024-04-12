package es.ies.puerto.enumerado;
/**
 * Define un enum llamado ColorArcoiris que incluya los colores del arcoíris (ROJO, NARANJA, AMARILLO, VERDE, AZUL, AÑIL, VIOLETA). 
 * Luego, crea un método que tome un color como entrada y devuelva un mensaje indicando si el color es cálido (rojo, naranja, amarillo) o frío (verde, azul, añil, violeta).
 */
public enum EnumColorArcoiris {
    ROJO("Rojo"),
    NARANJA,
    AMARILLO,
    VERDE,
    AZUL,
    AÑIL,
    VIOLETA;


    private String valor;
    EnumColorArcoiris(String valor){
        this.valor = valor;
    }

    EnumColorArcoiris() {}

    public String getColor(){
        return valor;
    }


}
