/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio4;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        Colores amarillo = new Colores("amarillo");
        Colores verde = new Colores("verde");
        Colores blanco = new Colores("blanco");
        Colores violeta = new Colores("violeta");
        Colores cyan = new Colores("cyan");

        Surtidor estacion = new Surtidor("Neuquen");
        Auto a0 = new Auto("121-797", amarillo.pintar("Mercedez"), "ZF-120", 600, estacion);
        Auto a1 = new Auto("722-797", violeta.pintar("Nii-san"), "ara-ara", 600, estacion);
        Auto a2 = new Auto("6321-797", cyan.pintar("Ferrari"), "fachesco", 600, estacion);
        Auto a3 = new Auto("44421-797", blanco.pintar("Ford"), "F-100", 600, estacion);
        Auto a4 = new Auto("2231-797", verde.pintar("Chevrolet"), "Che-1928", 600, estacion);

        Auto colAutos[] = {a0, a1, a2, a3, a4};
        Thread misHilos[] = new Thread[4];

        for (int i = 0; i < misHilos.length; i++) {
            misHilos[i] = new Thread(colAutos[i]);
        }
        
        for(Thread hilo: misHilos){
            hilo.start();
        }

    }
}
