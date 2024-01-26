package ies.puerto.Ejercicios.Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class RegistroCliente {
    private static List<Cliente> clientes;

    public RegistroCliente(){
        clientes = new ArrayList<>();
    }

    public RegistroCliente(List<Cliente> clientes){
        this.clientes = clientes;
    }

//Revisar metodos, y equals, el cual es necesario para realizar estos metodos.

    public Cliente buscarCliente(String numeroCliente){
        Cliente clienteBuscar = new Cliente("", numeroCliente);

        return buscarCliente(clienteBuscar);
    }

    public Cliente buscarCliente(Cliente cliente){

        for (Cliente clienteLista : clientes) {
            if(cliente.equals(clienteLista)){
                return clienteLista;
            }
        }

        return null;
    }

    public void addCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
        }
    }

    public void transaccion(String numeroCliente, float cantidad){
        Cliente cliente = new Cliente(numeroCliente);
        if(clientes.contains(cliente)){
            
        }
        if(buscarCliente(cliente) != null){

        }
    }
}
