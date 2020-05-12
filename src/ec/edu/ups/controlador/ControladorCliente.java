/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DireccionDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.IDireccionDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Direccion;
import ec.edu.ups.vista.VistaCliente;
import ec.edu.ups.vista.VistaDireccion;
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
    private VistaDireccion vistaDireccion;
    //objetos modelo
    private Cliente cliente;
    private Direccion direccion;
    //objetos DAO
    private IClienteDAO clienteDAO;
    private IDireccionDAO direccionDAO;
    

    // constructor
    public ControladorCliente(VistaCliente vistaCliente, ClienteDAO clienteDAO, VistaDireccion vistaDireccion, DireccionDAO direccionDAO) {
        this.vistaCliente = vistaCliente;
        this.clienteDAO = clienteDAO;
        
        this.vistaDireccion = vistaDireccion;
        this.direccionDAO = direccionDAO;
        

    }

    //llama al DAO para guardar un cliente
    public void registrar() {
        cliente = vistaCliente.ingresarCliente();
        clienteDAO.create(cliente);
    }

    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public void verCliente() {
        int id = vistaCliente.buscarCliente();
        cliente = clienteDAO.read(id);
        vistaCliente.verCliente(cliente);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar() {
        cliente = vistaCliente.actualizarCliente();
        clienteDAO.update(cliente);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar() {
        cliente = vistaCliente.eliminarCliente();
        clienteDAO.delete(cliente);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verClientes() {
        List<Cliente> clientes;
        clientes = clienteDAO.findAll();
        vistaCliente.verClientes(clientes);
    }
    
    //ejemplo de agregacion
    public void agregarDireccion(){
        int id = vistaDireccion.buscarDireccion();
        direccion = direccionDAO.read(id);
        cliente.agregarDireccion(direccion);
        clienteDAO.update(cliente);        
    }


}
