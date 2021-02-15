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
public class Cactus extends PlantaTropical {
    //Atributos
    private boolean pinchos;
    
    //Método
    @Override
    public String regar(int cantidad, int tiempo) {
            if (pinchos) {
            return "Necesitamos regar con " + cantidad + " ml de agua durante " + tiempo + " segundos." + " Cuidado con los pinchos !!!!";
        } else {
            return "Necesitamos regar con " + cantidad + " ml de agua durante " + tiempo + " segundos.";
       }            
       
    }
    
    //toString
    @Override
    public String toString() {
        return "Cactus{" + "pinchos=" + pinchos + '}' + " " + super.toString();
    }

    //Constructores

    public Cactus() {
    }

    public Cactus(boolean pinchos, int humedad, boolean flores, boolean vegetal, boolean sol, String color) {
        super(humedad, flores, vegetal, sol, color);
        this.pinchos = pinchos;
    }

    public Cactus(boolean pinchos) {
        this.pinchos = pinchos;
    }
    
    //Setters y Getters

    public boolean isPinchos() {
        return pinchos;
    }

    public void setPinchos(boolean pinchos) {
        this.pinchos = pinchos;
    }
    
    
    
    
}
