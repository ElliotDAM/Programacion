package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTests {
    
    @Test
    public void testCreacionCuentaBancariaOk(){

        int numeroCuenta = 12345;
        String nombreTitular = "Juan";
        double saldo = 1000.00;

        CuentaBancaria ccc = new CuentaBancaria(numeroCuenta, nombreTitular, saldo);

        Assertions.assertEquals(numeroCuenta, ccc.getNumeroCuenta(), "El numero de cuenta no coincide.");
        Assertions.assertEquals(nombreTitular, ccc.getNombreTitular(), "El nombre del usuario no coincide.");
        Assertions.assertEquals(saldo, ccc.getSaldo(), "El saldo no coincide.");
    }

    @Test
    public void testMostrarInformacionUsuarioOk(){

        int numeroCuenta = 12345;
        String nombreTitular = "Juan";
        double saldo = 1000.00;

        CuentaBancaria ccc = new CuentaBancaria(numeroCuenta, nombreTitular, saldo);

        String infoEsperada = "Nombre: Juan, Numero de cuenta: 12345, Saldo: 1000.00.";
        String infoObtenida = ccc.mostrarInformacionUsuario();

        Assertions.assertEquals(infoEsperada, infoObtenida, "La informacion del usuario no coincide.");

    }

    @Test
    public void testRealizarDepositoOk(){

        int numeroCuenta = 12345;
        String nombreTitular = "Juan";
        double saldo = 1000.00;
        double deposito = 300.00;
        double saldoFuturo = 1300.00;

        CuentaBancaria ccc = new CuentaBancaria(numeroCuenta, nombreTitular, saldo);
        ccc.realizarDeposito(deposito);

        Assertions.assertEquals(saldoFuturo, ccc.getSaldo(), "El saldo despues del deposito no es el esperado.");

    }

    @Test
    public void testRealizarRetiradaConFondos(){
        
        int numeroCuenta = 12345;
        String nombreTitular = "Juan";
        double saldo = 1000.00;
        double retiro = 300.00;
        double saldoFuturo = 700.00;

        CuentaBancaria ccc = new CuentaBancaria(numeroCuenta, nombreTitular, saldo);
        boolean resultadoRetiro = ccc.realizarRetirada(retiro);

        Assertions.assertTrue(resultadoRetiro, "El retiro deberia ejecutarse.");
        Assertions.assertEquals(saldoFuturo, ccc.getSaldo(), "El saldo despues del retiro no es el correcto.");
    }

    @Test
    public void testRealizarRetiradaSinFondos(){
         int numeroCuenta = 12345;
        String nombreTitular = "Juan";
        double saldo = 50.00;
        double retiro = 300.00;
        

        CuentaBancaria ccc = new CuentaBancaria(numeroCuenta, nombreTitular, saldo);
        boolean resultadoRetiro = ccc.realizarRetirada(retiro);

        Assertions.assertFalse(resultadoRetiro, "El retiro no deberia ejecutarse por saldo insuficiente.");
        Assertions.assertEquals(saldo, ccc.getSaldo(), "El saldo no deberia haber cambiado despues del retiro incompleto.");
    }
}
