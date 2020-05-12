/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase modelo.
 *
 * Logica del negocio dentro del ejemplo MVC + DAO
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellido;
    //atributo de agregación
    private List<Direccion> direcciones;

    //constructores
    public Cliente() {
        direcciones = new ArrayList<>();
    }

    public Cliente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        direcciones = new ArrayList<>();
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //métodos de la agregación
    public void agregarDireccion(Direccion direccion) {
        direcciones.add(direccion);
    }

    public void actualizarDireccion(Direccion direccion) {
        if (direcciones.contains(direccion)) {
            int index = direcciones.indexOf(direccion);
            direcciones.set(index, direccion);
        }
    }

    public void eliminarDireccion(Direccion direccion) {
        if (direcciones.contains(direccion)) {
            int index = direcciones.indexOf(direccion);
            direcciones.remove(index);
        }
    }

    public List<Direccion> listar() {
        return direcciones;
    }

    public Direccion buscar(int id) {

        return direcciones.get(id);

    }

    //métodos de la clase Object
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}' + "\nDirecciones: " + direcciones.toString();
    }

}
