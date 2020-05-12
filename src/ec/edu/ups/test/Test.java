/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorDireccion;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DireccionDAO;
import ec.edu.ups.idao.IDireccionDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.VistaCliente;
import ec.edu.ups.vista.VistaDireccion;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class Test {

    public static void main(String[] args) {

        // vista
        VistaCliente vistaC = new VistaCliente();
        VistaDireccion vistaD = new VistaDireccion();
        //DAOs
        ClienteDAO clienteDAO = new ClienteDAO();
        DireccionDAO direccionDAO = new DireccionDAO();
        // controlador
        ControladorCliente controladorCliente = new ControladorCliente(vistaC, clienteDAO, vistaD, direccionDAO);
        ControladorDireccion controladorDireccion = new ControladorDireccion(vistaD, direccionDAO);

        // guarda un cliente a través del controlador        
        controladorCliente.registrar();
        controladorCliente.registrar();
        controladorCliente.registrar();                

        // ver clientes
        controladorCliente.verClientes();

        // editar un cliente por medio del id        
        controladorCliente.actualizar();

        // ver clientes
        controladorCliente.verClientes();

        // eliminar un cliente por medio del id
        controladorCliente.eliminar();

        // ver clientes
        controladorCliente.verClientes();
        
        // guardar direcciones
        controladorDireccion.registrar();
        //controladorDireccion.registrar();
        //controladorDireccion.registrar();
        
        //ver direcciones
        controladorDireccion.verDirecciones();
        
        //asignar direcion
        controladorCliente.verCliente();
        controladorCliente.agregarDireccion();
        
        //ver clientes
        controladorCliente.verClientes();
    }

}
