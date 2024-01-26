package ies.puerto.Ejercicios.Ejercicio9;
/**
 * Implementa una clase RegistroClientes que contenga un ArrayList de objetos Cliente. Cada cliente tiene un nombre, 
 * un número de cliente y un saldo. Escribe métodos para agregar clientes, buscar clientes por número y realizar una 
 * transacción (actualizar el saldo)
 */
public class Cliente {
    private String nombre;
    private String numero;
    private float saldo;
    
    public Cliente(String numero) {
        this.numero = numero;
    }

    public Cliente(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String numero, float saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void actualizarSaldo(float cantidad){
        this.saldo += cantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

    
}
