/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej2;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class MiEjecucion extends Thread {

    Colores verde = new Colores("verde");

    public void run() {
        ir();
    }

    public void ir() {
        hacerMas();
    }

    public void hacerMas() {
        System.out.println(verde.pintar("En la pila"));
    }
}
