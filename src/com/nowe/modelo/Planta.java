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
public abstract class Planta {
    //Atributos
    protected boolean vegetal, sol;
    protected String color;
    
    //Métodos
    public abstract String regar(int cantidad, int tiempo);
    
    
    //toString
    @Override
    public String toString() {
        return "Planta{" + "vegetal=" + vegetal + ", sol=" + sol + ", color=" + color + '}';
    }
    
    
    //Constructores
    public Planta() {
    }

    public Planta(boolean vegetal, boolean sol, String color) {
        this.vegetal = vegetal;
        this.sol = sol;
        this.color = color;
    }
    
    //Setters y Getters
    public boolean isVegetal() {
        return vegetal;
    }

    public void setVegetal(boolean vegetal) {
        this.vegetal = vegetal;
    }

    public boolean isSol() {
        return sol;
    }

    public void setSol(boolean sol) {
        this.sol = sol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    
    
    
}
