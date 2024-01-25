package ies.puerto.Ejercicio9;

import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroClientes registro = new RegistroClientes();
        
        Cliente cliente1 = new Cliente("Pedro", 12, 150f);
        Cliente cliente2 = new Cliente("Ramon", 34, 400f);

        registro.agregarCliente(cliente1);
        registro.agregarCliente(cliente2);

        System.out.println("Inserta numero de cliente a buscar:");
        int numeroCliente = sc.nextInt();

        Cliente clienteBusqueda = registro.buscarCliente(numeroCliente);

        if(clienteBusqueda != null){
            System.out.println("Cliente: "+clienteBusqueda.getNombre());
        }else{
            System.out.println("No se encontro cliente con ese numero");
        }

        System.out.println("Quiere realizar alguna transaccion?");
        float transaccion = sc.nextFloat();
        registro.transaccion(numeroCliente, transaccion);

        for (Cliente cliente : RegistroClientes.getClientes()) {
            System.out.println("Cliente: "+cliente.getNombre()+", Saldo: "+cliente.getSaldo());
        }
    }
}
