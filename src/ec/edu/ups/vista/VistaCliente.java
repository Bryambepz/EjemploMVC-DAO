/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class VistaCliente {

    public Cliente ingresarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del cliente");
        int id = entrada.nextInt();
        String nombre = entrada.next();
        String apellido = entrada.next();
        return new Cliente(id, nombre, apellido);
    }

    public Cliente actualizarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a actualizar");
        int id = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos (nombre, apellido)");
        String nombre = entrada.next();
        String apellido = entrada.next();
        return new Cliente(id, nombre, apellido);
    }

    public Cliente eliminarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a eliminar");
        int id = entrada.nextInt();
        return new Cliente(id, null, null);
    }

    public int buscarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a buscar");
        int id = entrada.nextInt();
        return id;
    }

    public void verCliente(Cliente cliente) {
        System.out.println("Datos del Cliente: " + cliente);
    }

    public void verClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Datos del Cliente: " + cliente);
        }
    }

}
