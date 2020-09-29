/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio8;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Dan
 */
public class Testigo {

    private Semaphore semCarrera;

    public Testigo() {
        this.semCarrera = new Semaphore(1);
    }

    public boolean puedeCorrer() {
        boolean flag = this.semCarrera.tryAcquire();
        if (flag) {
            System.out.println("empieza a correr: " + Thread.currentThread().getName());
        }
        return flag;
    }
    public double timePosta(double time) throws InterruptedException {
        this.semCarrera.release();
        return 9 + (int) (Math.random() * 3) + (System.currentTimeMillis() - time) / 1000;
    }

}
