/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import com.nowe.modelo.PLujo;
import com.nowe.modelo.Producto;
import com.nowe.modelo.Producto1Necesidad;

/**
 *
 * @author agarm
 */
public class Main_Producto_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio:
        //Instanciar un Producto con el nombre de objeto p1, asignarle valor a los atributos por medio del constructor
        //No se puede hacer, porque no se puede instanciar un Producto de Producto, así que hago uno de primera necesidad
        Producto p1 = new Producto1Necesidad("alimento", "pan", 0.5);
        System.out.println("El producto " + p1.toString() + " tiene un precio total con IVA dee " + p1.calcularIVA());
            
        //Instanciar un Producto1Necesidad con el nombre de objeto p2,  asignarle valor a los atributos por medio del setters
        Producto1Necesidad p2 = new Producto1Necesidad();
        p2.setTipo("alimento");
        p2.setNombre("arroz");
        p2.setPvp(0.86);
        System.out.println("El producto " + p2.toString() + " tiene un precio total con IVA de " + p2.calcularIVA());
                
        //Instanciar un Producto1Necesidad con el nombre de objeto p3, asignarle valor a los atributos por medio del constructor
        Producto1Necesidad p3 = new Producto1Necesidad("alimento", "harina", 0.65);
        System.out.println("El producto " + p3.toString() + " tiene un precio total con IVA de " + p3.calcularIVA());
        
        //Instanciar un Producto1Necesidad con el nombre de objeto p4, en una referencia de producto, asginarle valor a los atributos por medio del constructor
        Producto p4 = new Producto1Necesidad("higiene personal", "papel higienico", 1.25);
        System.out.println("El producto " + p3.toString() + " tiene un precio total con IVA de " + p3.calcularIVA());
        
        //Instanciar un PLujo con el nombre de objeto p5,  asignarle valor a los atributos por medio del setters
        PLujo p5 = new PLujo();
        p5.setMaterial("oro");
        p5.setNombre("anillo");
        p5.setPvp(320);
        System.out.println("El producto " + p4.toString() + " tiene un precio total con IVA de " + p4.calcularIVA());
        
        //Instanciar un PLujo con el nombre de objeto p6, asignarle valor a los atributos por medio del constructor
        PLujo p6 = new PLujo("oro y diamantes", "pendientes", 2_500);
        System.out.println("El producto " + p6.toString() + " tiene un precio total con IVA de " + p6.calcularIVA());
        
        //Instanciar un PLujo con el nombre de objeto p7, en una referencia de producto, asginarle valor a los atributos por medio del constructor
        Producto p7 = new PLujo("plata", "reloj", 12_000);
        System.out.println("El producto " + p7.toString() + " tiene un precio total con IVA de " + p7.calcularIVA());
        
        //Hacer una matriz de productos asignandole los objetos creados
        Producto[] productos = new Producto[7];
        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;
        productos[4] = p5;
        productos[5] = p6;
        productos[6] = p7;
        
        //Recorrerla en un bucle foreach para calcular el iva de todos los productos
        for (Producto e : productos) {
            System.out.println("El precio total con IVA del producto " + e.getNombre() + " es " + e.calcularIVA() + " €");
        }
        
    }
    
}
