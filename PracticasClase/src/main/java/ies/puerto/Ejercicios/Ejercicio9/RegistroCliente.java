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
        Cliente clienteActualizar = new Cliente(numeroCliente);

        if(!clientes.contains(clienteActualizar)){
            return;
        }
        /** Primera opcion (mejor opcion) **/
        int posicionCliente = clientes.indexOf(clienteActualizar);

        clienteActualizar = buscarCliente(clienteActualizar);

        clienteActualizar.actualizarSaldo(cantidad);//actualizamos su saldo, no vale el metodo setSaldo ya que eso sustituiria la cantidad que tiene el cliente, en cambio con actualizarSaldo se suma

        clientes.add(posicionCliente, clienteActualizar); //actualizamos el cliente en la misma posicion en la que estaba
        clientes.set(posicionCliente, clienteActualizar);

        /** Segunda opcion **/

        Cliente clienteActualizar2 = new Cliente(numeroCliente);
        for (Cliente clienteLista : clientes) {
            if(clienteLista.equals(clienteActualizar2)){
                clienteLista.actualizarSaldo(cantidad);
            }            
        }
    }
}
