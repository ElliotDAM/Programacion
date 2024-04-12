package es.ies.puerto.enumerados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.enumerado.EnumColorArcoiris;

public class ColorArcoirisTest {
    EnumColorArcoiris colorArcoiris;

    @BeforeEach
    public void beforeEach(){
        
    }

    @Test
    public void colorArcoirisRojoTest(){
        colorArcoiris = EnumColorArcoiris.ROJO;
        Assertions.assertEquals(colorArcoiris, EnumColorArcoiris.ROJO);
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris));
    }

    @Test
    public void colorArcoirisAmarilloTest(){
        colorArcoiris = EnumColorArcoiris.AMARILLO;
        Assertions.assertEquals(colorArcoiris, EnumColorArcoiris.AMARILLO);
        Assertions.assertTrue(EnumColorArcoiris.AMARILLO.equals(colorArcoiris));
    }

    @Test
    public void colorArcoirisMiColorTest(){
        colorArcoiris = EnumColorArcoiris.valueOf("ROJO");
        Assertions.assertEquals(colorArcoiris, EnumColorArcoiris.ROJO);
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris));
    }
    
}
