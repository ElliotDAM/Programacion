package ies.puerto;

public class Ejercicio3 {
    public static void main(String[] args) {


    }

    /**
     *
     * @param numUsuario
     * @return resultado
     */
    public int calcularFibonacciPosicionN(int numUsuario) {

        int primerNumero = 0;
        int segundoNumero = 1;
        int resultado = 0;

        for (int i = 1; i < numUsuario; i++) {
            resultado = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = resultado;
        }
        return resultado;
    }
}