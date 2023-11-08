package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTests {
    
    @Test
    public void testCrearCirculoOk(){
        
        int radio = 10;
        Circulo circulo = new Circulo(radio);

        
        int radioObtenido = circulo.getRadio();

        Assertions.assertEquals(radio, radioObtenido, "El radio del circulo no coincide.");
        
    }

    @Test
    public void testAreaCirculoOK(){

        int radio = 10;
        Circulo circulo = new Circulo(radio);

        double areaEsperada = Math.PI * radio * radio;
        double areaObtenida = circulo.areaCirculo();

        Assertions.assertEquals(areaEsperada, areaObtenida, "El calculo del area no es correcto.");
    }

    @Test
    public void testPerimetroCirculoOk(){

        int radio = 10;
        Circulo circulo = new Circulo(radio);

        double perimetroEsperado = 2 * Math.PI * radio;
        double perimetroObtenido = circulo.perimetroCirculo();

        Assertions.assertEquals(perimetroEsperado, perimetroObtenido, "El calculo del perimetro no es correcto.");


    }
}
