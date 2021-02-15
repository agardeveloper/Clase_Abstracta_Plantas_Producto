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
public class PlantaTropical extends Planta{
    //Atributo
    protected int humedad;
    protected boolean flores;
    
    //Método
    @Override
    public String regar(int cantidad, int tiempo) {
         return "Necesitamos regar con " + cantidad + " ml de agua durante " + tiempo + " segundos.";
    }
    
    public String florecer(){
        return "esta palnta puede florecer";
    }
    
     //toString
    @Override
    public String toString() {
        return "PlantaTropical{" + "humedad=" + humedad + ", flores=" + flores + '}' + " " + super.toString();
    }
    
    //Constructores

    public PlantaTropical() {
    }

    public PlantaTropical(int humedad, boolean flores, boolean vegetal, boolean sol, String color) {
        super(vegetal, sol, color);
        this.humedad = humedad;
        this.flores = flores;
    }

    public PlantaTropical(int humedad, boolean flores) {
        this.humedad = humedad;
        this.flores = flores;
    }
    
    //Setters y Getters

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public boolean isFlores() {
        return flores;
    }

    public void setFlores(boolean flores) {
        this.flores = flores;
    }
    
   
    
    
    
}
