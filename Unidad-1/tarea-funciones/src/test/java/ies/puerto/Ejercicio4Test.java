package test.java.ies.puerto;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4;
    @BeforeEach
    public void before(){
        ejercicio4 = new Ejercicio4();
        
    }

    @Test
    public void maximoTest(){
        int numero1 = 2;
        int numero2 = 1;
        int resultadoOk = 0;
        int resultado = ejercicio4.maximo(numero1, numero2);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void maximoTres(){
        int primerMaximo = 2;
        int maximoTotal = 4;
        int resultadoOk = 0;
        int resultado = ejercicio4.maximo3(primerMaximo, maximoTotal);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}