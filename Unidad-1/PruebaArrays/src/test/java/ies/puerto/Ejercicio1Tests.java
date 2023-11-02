package ies.puerto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void testCalcularSumaOk(){
        
        int posibleResultado = 150;
        int resultado = ejercicio1.calcularSuma();
        Assertions.assertEquals(posibleResultado, resultado, "Esta suma es la correcta.");
    }

  
    @Test
    public void testCalcularSumaError(){
        
        int resultadoErroneo = 120;
        int resultado = ejercicio1.calcularSuma();
        Assertions.assertNotEquals(resultadoErroneo, resultado, "Este resultado no se corresponde con la solucion.");
    }

    


}
