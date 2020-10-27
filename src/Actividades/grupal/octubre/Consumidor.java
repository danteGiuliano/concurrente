/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.octubre;

/**
 *
 * @author Dan
 */
public class Consumidor extends Thread {

    private Buffer unBuffer;

    public Consumidor(Buffer unBuffer) {
        this.unBuffer = unBuffer;
    }

    public void run() {
        //A trabajar!
        while (true) {
            try {
                this.unBuffer.consume();
             //Thread.sleep(100)
            } catch (Exception e) {
                System.out.println("ERROR " + e + Thread.currentThread().getName());
            }
        }
    }
}
