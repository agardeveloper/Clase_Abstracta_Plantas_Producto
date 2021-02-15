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
public abstract class Producto {
    //Atributos
    protected String nombre;
    protected double pvp;
    
    //Método
    public abstract double calcularIVA();
    
    //toString
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", pvp=" + pvp + '}';
    }
    
    //Constructores
    public Producto() {
    }

    public Producto(String nombre, double pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }

    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }


}
