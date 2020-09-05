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
public class MiEjecucion implements Runnable{

    public void run() {
        ir();
    }

    public void ir() {
        hacerMas();
    }

    public void hacerMas() {
        Colores violeta = new Colores("violeta");
        System.out.println(violeta.pintar("En la pila"));
    }
}


