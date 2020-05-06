/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.VistaCliente;
import java.util.List;

/**
 * Controlador Cliente.
 *
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class ControladorCliente {

    //objetos vist
    private VistaCliente vistaCliente;
    private IClienteDAO clienteDAO;

    // constructor
    public ControladorCliente(VistaCliente vistaCliente) {
        this.vistaCliente = vistaCliente;
        this.clienteDAO = new ClienteDAO();

    }

    //llama al DAO para guardar un cliente
    public void registrar() {
        Cliente cliente = vistaCliente.ingresarCliente();
        clienteDAO.create(cliente);
    }

    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public void verCliente() {
        int id = vistaCliente.buscarCliente();
        Cliente cliente = clienteDAO.read(id);
        vistaCliente.verCliente(cliente);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar() {
        Cliente cliente = vistaCliente.actualizarCliente();
        clienteDAO.update(cliente);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar() {
        Cliente cliente = vistaCliente.eliminarCliente();
        clienteDAO.delete(cliente);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verClientes() {
        List<Cliente> clientes;
        clientes = clienteDAO.findAll();
        vistaCliente.verClientes(clientes);
    }


}
