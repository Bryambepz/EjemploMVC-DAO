/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Direccion;
import java.util.List;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public interface IDireccionDAO {
    //Métodos CRUD
    public void create(Direccion direccion);
    public Direccion read(int id);
    public void update(Direccion direccion);
    public void delete(Direccion direccione);   
    public List<Direccion> findAll();
}
