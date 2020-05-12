/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class Direccion {

    private int id;
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;

    public Direccion() {
    }

    public Direccion(int id, String callePrincipal, String calleSecundaria, String numeracion) {
        this.id = id;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
    }

    public int getId() {
        return id;
    }

    public void serId(int id) {
        this.id = id;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Direccion other = (Direccion) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Direccion{" + "codigo=" + id + ", callePrincipal=" + callePrincipal + ", calleSecundaria=" + calleSecundaria + ", numeracion=" + numeracion + '}';
    }

}
