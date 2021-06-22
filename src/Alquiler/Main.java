/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquiler;

/**
 *
 * @author Alvaro
 */

public class Main {
    public static void main(String[] args) {
        Articulo tabla = new Articulo("Tabla SUP", Articulo.TABLA);
        Articulo neopreno = new Articulo("Neopreo adulto", Articulo.NEOPRENO);
        Articulo pala = new Articulo("Palas SUP", Articulo.ACCESORIO);

        Alquilar producto1 = new Alquilar(tabla, 2);
        Alquilar producto2 = new Alquilar(neopreno, 2);
        Alquilar producto3 = new Alquilar(pala, 1);

        Cliente cliente = new Cliente("Nombre_Cliente");

        cliente.addAlquiler(producto1);
        cliente.addAlquiler(producto2);
        cliente.addAlquiler(producto3);

        System.out.println(cliente.estado());
    }
}
