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
import java.util.Enumeration;
import java.util.Vector;

class Cliente {
    private String nombre;
    private Vector rentals = new Vector();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void addAlquiler(Alquilar arg) {
        rentals.addElement(arg);
    }

    public String getNombre() {
        return nombre;
    }

    public String estado() {
        double totalAlquiler = 0;
        int puntosAlquiler = 0;
        Enumeration alquileres = rentals.elements();
        String resultado = "Rental Record for " + getNombre() + "\n";
        while (alquileres.hasMoreElements()) {
            double thisImporte = 0;
            Alquilar alquilado = (Alquilar) alquileres.nextElement();

            //determine amounts for alquilado line
            switch (alquilado.getArticulo().getCodigoPrecio()) {
                case Articulo.NEOPRENO:
                    thisImporte += 4;
                    if (alquilado.getDiasAlquilado() > 3)
                        thisImporte += (alquilado.getDiasAlquilado() - 1) * 3;
                    break;
                case Articulo.TABLA:
                    thisImporte += alquilado.getDiasAlquilado() * 9;
                    break;
                case Articulo.ACCESORIO:
                    thisImporte += 5;
                    if (alquilado.getDiasAlquilado() > 3)
                        thisImporte += (alquilado.getDiasAlquilado() - 1) * 3;
                    break;
            }

            // add frequent renter points
            puntosAlquiler++;
            // add bonus for a two day new release rental
            if ((alquilado.getArticulo().getCodigoPrecio() == Articulo.TABLA) &&
                    alquilado.getDiasAlquilado() > 1) puntosAlquiler++;
            //show figures for this rental
            resultado += "\t" + alquilado.getArticulo().getTitulo() + "\t" +
                    String.valueOf(thisImporte) + "\n";
            totalAlquiler += thisImporte;

        }
        //add footer lines
        resultado += "Total a pagar " + String.valueOf(totalAlquiler) + "\n";
        resultado += "Ganaste " + String.valueOf(puntosAlquiler) +
                " puntos por tu compra";
        return resultado;
    }
}