package es.ies.puerto.enumerados;

import org.junit.jupiter.api.Test;

import es.ies.puerto.enumerado.TipoVehiculo;

public class VehiculoTest {
    TipoVehiculo tipoVehiculo;

    @Test
    public void vehiculoBiciTest(){
        tipoVehiculo = TipoVehiculo.BICI;
        System.out.println(tipoVehiculo.getTipo());
    }
}
