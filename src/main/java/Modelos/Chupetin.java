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
public class Chupetin extends Golosina {
    private int id;
    private String nombre;
    private boolean conChicle;
    private String sabor;

    public Chupetin(int id, String nombre, boolean conChicle, String sabor, String fabricante, String categoria) {
        super(fabricante, categoria);
        this.id = id;
        this.nombre = nombre;
        this.conChicle = conChicle;
        this.sabor = sabor;
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

    public boolean isConChicle() {
        return conChicle;
    }

    public void setConChicle(boolean conChicle) {
        this.conChicle = conChicle;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
