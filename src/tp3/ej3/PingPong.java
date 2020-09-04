/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej3;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class PingPong extends Thread {

    private Colores aleatorio = new Colores("aleatorio");

    private String cadena; // Lo que va a escribir.
    private int delay; // Tiempo entre escritura

    public PingPong(String cartel, int cantMs) {
        cadena = cartel;
        delay = cantMs;
    }

    ;
 public void run() {
        for (int i = 1; i < delay * 10; i++) {
            System.out.print(aleatorio.pintar(cadena));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Error en sleep");
            }
        }
    } //fin método run()
} //fin clase PingPong
