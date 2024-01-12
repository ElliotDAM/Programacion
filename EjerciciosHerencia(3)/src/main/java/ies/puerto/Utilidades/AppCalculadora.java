package ies.puerto.Utilidades;



public class AppCalculadora {
    public static void main(String[] args) {
        UtilidadesCal calculadora = new UtilidadesCal();

        int suma = calculadora.suma(2,3);
        int resta = calculadora.resta(3,2);
        int multiplicacion = calculadora.multiplicacion(5,4);
        int division = calculadora.division(6,2);

        System.out.println("La suma es: "+suma+", la resta es: "+resta+", la multiplicacion es: "+multiplicacion+", la division es: "+division);
        //System.out.println(calculadora.toString());
        //calculadora.toString();
    }
}
