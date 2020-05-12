/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.DireccionDAO;
import ec.edu.ups.idao.IDireccionDAO;
import ec.edu.ups.modelo.Direccion;
import ec.edu.ups.vista.VistaDireccion;
import java.util.List;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class ControladorDireccion {
    
    //objetos vist
    private VistaDireccion vistaDireccion;
    private Direccion direccion;
    private IDireccionDAO direccionDAO;

    // constructor
    public ControladorDireccion(VistaDireccion vistaDireccion, DireccionDAO direccionDAO) {
        this.vistaDireccion = vistaDireccion;
        this.direccionDAO = direccionDAO;
    }

    //llama al DAO para guardar un cliente
    public void registrar() {
        direccion = vistaDireccion.ingresarDireccion();
        direccionDAO.create(direccion);
    }

    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public void verDireccion() {
        int id = vistaDireccion.buscarDireccion();
        direccion = direccionDAO.read(id);
        vistaDireccion.verDireccion(direccion);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar() {
        direccion = vistaDireccion.actualizarDireccion();
        direccionDAO.update(direccion);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar() {
        direccion = vistaDireccion.eliminarDireccion();
        direccionDAO.delete(direccion);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verDirecciones() {
        List<Direccion> direcciones;
        direcciones = direccionDAO.findAll();
        vistaDireccion.verDirecciones(direcciones);
    }
}
