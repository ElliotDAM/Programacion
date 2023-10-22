package ies.puerto;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6;
    @BeforeEach
    public void before(){
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void conversionFarenheitCeliusTest(){
        int farenheit = 32;
        int resultadoOk = 0;
        double celsius = ejercicio6.conversionFarenheitCeliusTest(farenheit);

        Assertions.assertEquals(resultadoOk, celsius, "No es el resultado que se esperaba");

    }
}