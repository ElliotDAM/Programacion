package ies.puerto.Ejercicio9;

import java.util.ArrayList;

public class RegistroClientes {
    private static ArrayList<Cliente> clientes;

    public RegistroClientes(){
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente buscarCliente(int numeroCliente){
        for (Cliente cliente : clientes) {
            if(cliente.getNumeroCliente() == numeroCliente){
                return cliente;
            }
        }
        return null;
    }

    public void transaccion(int numeroCliente, float dinero){
        Cliente cliente = buscarCliente(numeroCliente);

        if(cliente != null){
            cliente.setSaldo(dinero);
        } else{
            System.out.println("Cliente no encontrado");
        }
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        RegistroClientes.clientes = clientes;
    }
}
