/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej6;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class MainThread {

    public static void main(String[] args) {
        Colores rojo = new Colores("rojo");
        Colores verde = new Colores("verde");
        Cliente cliente1 = new Cliente(rojo.pintar("Cliente 1"), new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente(verde.pintar("Cliiente 2"), new int[]{1, 3, 5, 1, 1});

        CajeraThread cajera1 = new CajeraThread(rojo.pintar("cajera1"), cliente1);
        CajeraThread cajera2 = new CajeraThread(verde.pintar("cajera2"), cliente2);
        Thread[] hilos = new Thread[2];

        hilos[0] = new Thread(cajera1);
        hilos[1] = new Thread(cajera2);
        for (Thread i : hilos) {
            i.start();
        }
    }

}
