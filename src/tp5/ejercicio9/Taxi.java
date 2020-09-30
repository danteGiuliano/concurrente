/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio9;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Dan
 */
public class Taxi {

    private Semaphore semTaxista;
    private Semaphore semPersona;

    public Taxi() {
        this.semPersona = new Semaphore(1);
        this.semTaxista = new Semaphore(0);
    }

    public void subePasajero() throws Exception {
        this.semPersona.acquire();
        this.semTaxista.release();
    }

    public boolean hayPasajero()  {
        return this.semTaxista.tryAcquire();
    }

    public void bajaPasajero() throws Exception {
        this.semPersona.release();
        this.semTaxista.release();
    }
}
