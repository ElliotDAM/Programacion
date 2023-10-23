package test.java.ies.puerto;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void maximoTestError(int numero1, int numero2){
        int resultadoOk = 0;
        int resultado = ejercicio4.maximo(numero1, numero2);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void maximoTresTest(int numero1, int numero2, int numero3){
        int maximo = ejercicio4.maximo(numero1, numero2);
        int maximoTres = ejercicio4.maximo(maximo, numero3);

    }
}