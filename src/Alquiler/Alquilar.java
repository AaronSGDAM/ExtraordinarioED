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
class Alquilar {
    private Articulo articulo;
    private int diasAlquilado;

    public Alquilar(Articulo articulo, int diasAlquilado) {
        this.articulo = articulo;
        this.diasAlquilado = diasAlquilado;
    }
    public int getDiasAlquilado() {
        return diasAlquilado;
    }
    public Articulo getArticulo() {
        return articulo;
    }
}