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
public class Producto1Necesidad extends Producto {
    //Atributos
    private String tipo;

    //Método
    @Override
    public double calcularIVA() {
        return pvp*1.04;
    }
    
    //toString
    @Override
    public String toString() {
        return "Producto1Necesidad{" + "tipo=" + tipo + '}' + " " + super.toString();
    }
    
    //Constructores
    public Producto1Necesidad() {
    }

    public Producto1Necesidad(String tipo, String nombre, double pvp) {
        super(nombre, pvp);
        this.tipo = tipo;
    }

   
    //Setters y Getters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
}
