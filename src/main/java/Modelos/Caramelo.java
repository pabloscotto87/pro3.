/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pabloscotto87
 */
public class Caramelo extends Golosina {

    private int id;
    private String nombre;
    private String color;
    private double precio;

    public Caramelo(int id, String nombre, String color, double precio, String fabricante, String categoria) {
        super(fabricante, categoria);
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
