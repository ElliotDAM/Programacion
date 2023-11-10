package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Tests{

    

    String titular = "Domingo";
    double saldo = 1000;

    Ejercicio4 usuario = new Ejercicio4(titular,saldo);

    @Test
    public void testCreacionCuentaBancaria(){


        Assertions.assertEquals(titular, usuario.getTitular(), "El nombre del titular no coincide.");
        Assertions.assertEquals(saldo, usuario.getSaldo(), "El saldo del titular no coincide.");
    }

    @Test
    public void testMostrarInformacionUsuarioOk(){

        String infoEsperada = "Titular:Domingo, Saldo:1000.0.";
        String infoObtenida = usuario.mostrarInformacion();

        Assertions.assertEquals(infoEsperada, infoObtenida, "Los datos del usuario no coinciden.");
    }

    @Test
    public void testDepositarSaldoOk(){

        double deposito = 300;
        double saldoEsperado = 1300;

        usuario.depositarSaldo(deposito);

        Assertions.assertEquals(saldoEsperado, usuario.getSaldo(), "El saldo despues del deposito no coincide con el que deberia estar.");
    }

    @Test
    public void testRetirarSaldoOk(){

        double retiro = 400;
        double saldoEsperado = 600;

        boolean resultadoRetiro = usuario.retirarSaldo(retiro);

        Assertions.assertTrue(resultadoRetiro, "El retiro debe ejecutarse.");
        Assertions.assertEquals(saldoEsperado, usuario.getSaldo(), "El saldo de la cuenta despues del retiro no coincide.");
    }

    public void testRetirarSaldoSinFondos(){

        double retiro = 1200;
        
        boolean resultadoRetiro = usuario.retirarSaldo(retiro);
        Assertions.assertTrue(resultadoRetiro, "El retiro no se puede ejecutar. Faltan fondos.");
        Assertions.assertEquals(saldo, usuario.getSaldo(), "El saldo no deberia haber variado luego del retiro fallido.");
    }
}