package es.ies.puerto.enumerado;
/**
 * Implementa un enum llamado TipoVehiculo que represente diferentes tipos de vehículos (COCHE, MOTOCICLETA, CAMIÓN, BICICLETA, ETC). 
 * Después, crea un método que tome un tipo de vehículo como parámetro y devuelva la velocidad máxima permitida para ese tipo de vehículo.
 */
public enum TipoVehiculo {
    COCHE(1),
    CAMION(2),
    BICI(3);

    int tipo;
    TipoVehiculo(){}

    TipoVehiculo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo(){
        return tipo;
    }

}
