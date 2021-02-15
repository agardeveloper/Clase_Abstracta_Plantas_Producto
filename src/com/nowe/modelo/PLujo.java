/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.modelo;

/**
 *
 * @author agarm
 */
public class PLujo extends Producto{
    //Atributos
    private String material;
    
    //Métodos
    @Override
    public double calcularIVA() {
        return pvp*1.21;
    }
    
    //toString
    @Override
    public String toString() {
        return "PLujo{" + "material=" + material + '}' + " " + super.toString();
    }
    
    //Constructores
    public PLujo() {
    }

    public PLujo(String material, String nombre, double pvp) {
        super(nombre, pvp);
        this.material = material;
    }
    
    //Setters y Getters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
    
}
