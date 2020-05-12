/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Direccion;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class VistaDireccion {
    
    private Scanner entrada;

    public VistaDireccion() {
        entrada = new Scanner(System.in);
    }
    
    public Direccion ingresarDireccion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos de la direccion");
        int id = entrada.nextInt();
        String callePrincipal = entrada.next();
        String calleSecundaria = entrada.next();
        String numeracion = entrada.next();
        return new Direccion(id, callePrincipal, calleSecundaria, numeracion);
    }

    public Direccion actualizarDireccion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id de la direccion a actualizar");
        int id = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos (calle principal, calle secundaria, numeracion)");
        String callePrincipal = entrada.next();
        String calleSecundaria = entrada.next();
        String numeracion = entrada.next();
        return new Direccion(id, callePrincipal, calleSecundaria, numeracion);
    }

    public Direccion eliminarDireccion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id de la direccion a eliminar");
        int id = entrada.nextInt();
        return new Direccion(id, null, null, null);
    }

    public int buscarDireccion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id de la direccion a buscar");
        int id = entrada.nextInt();
        return id;
    }

    public void verDireccion(Direccion direccion) {
        System.out.println("Datos del Cliente: " + direccion);
    }

    public void verDirecciones(List<Direccion> direcciones) {
        for (Direccion direccion : direcciones) {
            System.out.println("Datos de la direcci´´n: " + direccion);
        }
    }
}
