/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.VistaCliente;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class Test {

    public static void main(String[] args) {

        // vista
        VistaCliente vista = new VistaCliente();
        // controlador
        ControladorCliente controlador = new ControladorCliente(vista);

        // guarda un cliente a través del controlador        
        controlador.registrar();
        controlador.registrar();
        controlador.registrar();

        // ver clientes
        controlador.verClientes();

        // editar un cliente por medio del id        
        controlador.actualizar();

        // ver clientes
        controlador.verClientes();

        // eliminar un cliente por medio del id
        controlador.eliminar();

        // ver clientes
        controlador.verClientes();

    }

}
