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
public class Productor extends Thread {

    private Buffer unBuffer;

    public Productor(Buffer unBuffer) {
        this.unBuffer = unBuffer;
    }

    public void run() {
        //A trabajar!
        while (true) {
            try {
                this.unBuffer.genera();
                 System.out.println("Productor: +1 "+this.unBuffer.ocupacion());
            } catch (Exception e) {
                System.out.println("ERROR " + e + Thread.currentThread().getName());
            }
        }
    }
}
