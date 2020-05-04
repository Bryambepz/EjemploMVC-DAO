/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class ClienteDAO implements IClienteDAO {

    private final List<Cliente> listaCliente;

    public ClienteDAO() {
        listaCliente = new ArrayList<>();
    }

    @Override
    public void create(Cliente cliente) {
        listaCliente.add(cliente);
    }

    @Override
    public Cliente read(int id) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente c = listaCliente.get(i);
            if (c.getId() == cliente.getId()) {
                listaCliente.set(i, cliente);
                break;
            }
        }

    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> it = listaCliente.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getId() == cliente.getId()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cliente> findAll() {
        return listaCliente;
    }

}
