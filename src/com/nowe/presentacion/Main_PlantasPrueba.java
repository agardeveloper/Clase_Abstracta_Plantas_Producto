/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import com.nowe.modelo.Cactus;
import com.nowe.modelo.Planta;
import com.nowe.modelo.PlantaTropical;

/**
 *
 * @author agarm
 */
public class Main_PlantasPrueba {

    /**
     * @param args the command line arguments
     */
    /*
    Crear la clase abstracta Planta con un método abstracto:
    regar(int cantidad, int tiempo)
    además crearemos todas propiedades y métodos que se os ocurran
    Creamos las clases PlantaTropical, Cactus donde implementaremos el método
    abstracto.
    Desde una clase principal crear objetos utilizando polimorfismo.
    */
    
    public static void main(String[] args) {
        // Instanciar
        Planta tropical1 = new PlantaTropical(100, true, true, true, "morada");
        System.out.println(tropical1.regar(100, 100));
        System.out.println(tropical1);
        System.out.println(tropical1.toString());
        
        Planta cactus1 = new Cactus(true, 10, true, true, false, "verde oscuro");
        System.out.println(cactus1.regar(10, 10));
        System.out.println(cactus1.toString());
        
        //Instanciar la clase PlantaTropical asignando valor a los atributos por medio de los setters
        PlantaTropical pt1 = new PlantaTropical();
        pt1.setFlores(true);
        pt1.setHumedad(5);
        pt1.setVegetal(true);
        pt1.setColor("verde");
        pt1.setSol(false);
        System.out.println(pt1.toString());
        System.out.println(pt1.regar(10, 10));
        
        //Instanciar la clase PlantaTropical en una referencia de Planta asignando valor a los atributos por medio del constructor
        Planta p1 = new PlantaTropical(100, true, true, true, "verde y morada");
        System.out.println(p1.toString());
        System.out.println(p1.regar(100, 130));
        
        //Instanciar la clase Cactus en una referencia de Planta asignando valor a los atributos por medio de setters con nombre de objeto p2
        Planta p2 = new Cactus();
        p2.setColor("verde oscuro");
        p2.setVegetal(true);
        p2.setSol(true);
        System.out.println(p2.toString());
        System.out.println(p2.regar(5, 15));
        
        //Instanciar la clase Cactus en una referencia de Planta asignando valor a los atributos por medio de un constructor. Nombre objeto p3
        Planta p3 = new Cactus(true, 1, false, true, false, "verde con motas grises");
        System.out.println(p3.toString());
        System.out.println(p3.regar(3, 3));
        
        //Array de planta
        Planta[] plantas = new Planta[5];
        plantas[0] = tropical1;
        plantas[1] = pt1;
        plantas[2] = p1;
        plantas[3] = p2;
        plantas[4] = p3;
        
        for (Planta e : plantas) {
            System.out.println(e.regar(25, 50));
            System.out.println(e.toString());        
        }
        
    }
    
}
