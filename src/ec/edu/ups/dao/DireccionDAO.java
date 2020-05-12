/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IDireccionDAO;
import ec.edu.ups.modelo.Direccion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class DireccionDAO implements IDireccionDAO{
    private List<Direccion> listaDireccion;

    public DireccionDAO() {
        listaDireccion = new ArrayList<>();
    }

    @Override
    public void create(Direccion direccion) {
        listaDireccion.add(direccion);
    }

    @Override
    public Direccion read(int id) {
        for (Direccion direccion : listaDireccion) {
            if (direccion.getId() == id) {
                return direccion;
            }
        }
        return null;
    }

    @Override
    public void update(Direccion direccion) {
        for (int i = 0; i < listaDireccion.size(); i++) {
            Direccion c = listaDireccion.get(i);
            if (c.getId() == direccion.getId()) {
                listaDireccion.set(i, direccion);
                break;
            }
        }

    }

    @Override
    public void delete(Direccion direccion) {
        Iterator<Direccion> it = listaDireccion.iterator();
        while (it.hasNext()) {
            Direccion d = it.next();
            if (d.getId() == direccion.getId()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Direccion> findAll() {
        return listaDireccion;
    }
}
