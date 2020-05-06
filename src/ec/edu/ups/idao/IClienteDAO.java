/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Cliente;
import java.util.List;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public interface IClienteDAO {
    //Métodos CRUD
    public void create(Cliente cliente);
    public Cliente read(int id);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);   
    public List<Cliente> findAll();
}
