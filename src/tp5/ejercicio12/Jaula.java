/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio12;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Dan
 */
public class Jaula {

    ReentrantLock lockComedero;
    ReentrantLock lockHamaca;
    ReentrantLock lockRueda;

    public Jaula() {
        this.lockComedero = new ReentrantLock();
        this.lockHamaca = new ReentrantLock();
        this.lockRueda = new ReentrantLock();
    }

    public void comerEnPlato(String nombre) throws Exception {
        this.lockComedero.lock();
        System.out.println("Hamster: " + nombre + " esta comiendo en el plato");
        Thread.sleep(1000);
        System.out.println("Hamster: " + nombre + " lleno! se va del plato");
        this.lockComedero.unlock();
    }

    public void correrEnRueda(String nombre) throws Exception {
        this.lockRueda.lock();
        System.out.println("Hamster: " + nombre + " esta corriendo en la rueda");
        Thread.sleep(1000);
        System.out.println("Haster: " + nombre + " Cansado.. de correr se baja de la rueda");
        this.lockRueda.unlock();
    }

    public void descanzarHamaca(String nombre) throws Exception {
        this.lockHamaca.lock();
        System.out.println("Hamster: " + nombre + " esta acostandose a mimir.");
        Thread.sleep(1000);
        System.out.println("Haster: " + nombre + " Despertando!! se va de la hamaca");
        this.lockHamaca.unlock();
    }

}
