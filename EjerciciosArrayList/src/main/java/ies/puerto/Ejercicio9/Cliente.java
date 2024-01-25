package ies.puerto.Ejercicio9;

public class Cliente {
    private String nombre;
    private int numeroCliente;
    private float saldo;

    public Cliente(){}
    
    public Cliente(String nombre, int numeroCliente, float saldo) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", numeroCliente=" + numeroCliente + ", saldo=" + saldo + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo += saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + numeroCliente;
        result = prime * result + Float.floatToIntBits(saldo);
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
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (numeroCliente != other.numeroCliente)
            return false;
        if (Float.floatToIntBits(saldo) != Float.floatToIntBits(other.saldo))
            return false;
        return true;
    }

    
}
