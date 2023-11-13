package ies.puerto;
/**
 * Clase compuesta de una cuenta bancaria y varios metodos que se realizan en ella.
 * @author ElliotDAM
 */
public class Ejercicio4{

    private String titular;
    private double saldo;

    public Ejercicio4(){}

    /**
     * Constructor de la clase
     * @param titular
     * @param saldo
     */
    public Ejercicio4(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Getters y setters
     * @return
     */
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    /**
     * Metodo para mostrar informacion de usuario.
     * @return informacion de usuario
     */
    public String mostrarInformacion(){
        return "Titular:" + titular + ", Saldo:"+saldo+".";
    }

    /**
     * Metodo para depositar saldo en la cuenta del usuario
     * @param ingreso
     */
    public void depositarSaldo(double ingreso) {
        if (ingreso > 0) {
            saldo = saldo + ingreso;
        }
    }

    /**
     * Metodo para retirar saldo de la cuenta del usuario
     * @param retiro
     * @return
     */
    public boolean retirarSaldo(double retiro){

        if (retiro > saldo){
            System.out.println("Saldo insuficiente en su cuenta. No puede retirar");
            return false;
        }
        saldo = saldo - retiro;
        return true;
    }

    

}