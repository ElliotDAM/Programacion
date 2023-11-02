package ies.puerto;
//Corregir tests
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Tests{

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void testPosicionArrayValorOk(){

        int valor = 60;
        int posicion = 2;
        //int resultado = ejercicio5.posicionArray(valor);

        Assertions.assertEquals(posicion, resultado, "El valor introducido esta en la posicion 2.");
        
    }

    @Test
    public void testPosicionArrayValorInexistente(){

        int valor = 40;
        int posicion = -1;
        //int resultado = ejercicio5.posicionArray(valor);

        Assertions.assertEquals(posicion, resultado, "El valor introducido no se encuentra en el array.");
    }
}