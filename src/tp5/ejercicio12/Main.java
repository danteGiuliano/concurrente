/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio12;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Main {
    public static void main(String[] args) {
        Colores c0 = new Colores("rojo");
        Colores c1 = new Colores("amarillo");
        Colores c2 = new Colores("blanco");
        Colores c3 = new Colores("violeta");
        
        Jaula unaJaula = new Jaula();
        
        Hamster h1= new Hamster(c0.pintar("Totoro"),unaJaula);
        Hamster h2= new Hamster(c1.pintar("Bigotes"),unaJaula);
        Hamster h3= new Hamster(c2.pintar("Dormilon"),unaJaula);
        Hamster h4= new Hamster(c3.pintar("Pinky"),unaJaula);
        
        Hamster misHamsters[]={h1,h2,h3,h4};
        
        Thread misHilos[]=new Thread[4];
        
        for (int i = 0; i < misHilos.length; i++) {
            misHilos[i]= new Thread(misHamsters[i]);
        }
        
        for (Thread hilo :misHilos) {
            hilo.start();
        }
        
 
    }
}
