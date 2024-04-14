package es.ies.puerto;

import es.ies.puerto.modelo.imp.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoderTest {
    Poder poder;

    @BeforeEach
    public void beforeEach() {
        poder = new Poder(1, 1, "Volar");
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals(1, poder.getIdPoder());
        Assertions.assertEquals(1, poder.getIdPersonajePoder());
        Assertions.assertEquals("Volar", poder.getNombrePoder());
    }

    @Test
    public void testGettersAndSetters() {
        poder.setIdPoder(2);
        poder.setIdPersonajePoder(2);
        poder.setNombrePoder("Super fuerza");

        Assertions.assertEquals(2, poder.getIdPoder());
        Assertions.assertEquals(2, poder.getIdPersonajePoder());
        Assertions.assertEquals("Super fuerza", poder.getNombrePoder());
    }
}
