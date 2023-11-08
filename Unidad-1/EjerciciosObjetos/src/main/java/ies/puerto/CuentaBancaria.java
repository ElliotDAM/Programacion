package ies.puerto;

/**
 * Objeto creado para representar a un banco y sus funciones.
 * @author ElliotDAM
 */
public class CuentaBancaria{

    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;

    /**
     * Constructor por defecto
     */
    public CuentaBancaria(){}

    /**
     * Constructores del objeto
     * @param
     */
    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaBancaria(int numeroCuenta, String nombreTitular){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }
    public CuentaBancaria(int numeroCuenta, String nombreTitular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    /**
     * Getters y setters del objeto
     * @return
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String mostrarInformacionUsuario(){
        return "Nombre: " + nombreTitular + ", Numero de cuenta: " + numeroCuenta + ", Saldo: " + saldo + ".";
    }

    public void realizarDeposito(double ingreso){

        saldo = saldo + ingreso;
        
    }

    public boolean realizarRetirada(double retiro){
        if (retiro > saldo){
            System.out.println("Saldo insuficiente para retirar.");
            return false;
        }

        saldo = saldo - retiro;
        return true;
        
    }

}