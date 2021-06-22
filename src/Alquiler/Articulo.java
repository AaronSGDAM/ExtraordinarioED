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
public class Articulo {

    public static final int ACCESORIO = 1;
    public static final int NEOPRENO = 2;
    public static final int TABLA = 3;

    private String titulo;
    private int CodigoPrecio;

    public Articulo(String title, int priceCode) {
        this.titulo = title;
        this.CodigoPrecio = priceCode;
    }

    public int getCodigoPrecio() {
        return CodigoPrecio;
    }

    public void setCodigoPrecio(int arg) {
        CodigoPrecio = arg;
    }

    public String getTitulo (){
        return titulo;
    };
}