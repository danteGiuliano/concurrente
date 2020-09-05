/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej5;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class ThreadTesting {

    public static void main(String[] args) {
        Colores rojo = new Colores("rojo");
        for (int i = 0; i < 20; i++) {
            Thread miHilo = new Thread(new MiEjecucion());
            miHilo.start();
            System.out.println(rojo.pintar("En el main"));
        }

    }

}
