package ies.puerto;

/**
 * Objeto creado para representar a un banco y sus funciones.
 * @author ElliotDAM
 */
public class Banco{

    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;

    /**
     * Constructor por defecto
     */
    public Banco(){}

    /**
     * Constructores del objeto
     * @param
     */
    public Banco(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public Banco(int numeroCuenta, String nombreTitular){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }
    public Banco(int numeroCuenta, String nombreTitular, double saldo){
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

    public double realizarDeposito(double ingreso){

        double saldoAumenta = saldo + ingreso;
        return saldoAumenta;
    }

    public double realizarRetirada(double retiro){

        double saldoDisminuye = saldo - retiro;
        return saldoDisminuye;
    }

}