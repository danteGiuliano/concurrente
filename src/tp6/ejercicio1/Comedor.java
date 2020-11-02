/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6.ejercicio1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Dan
 */
public class Comedor {

    private String turno;
    private String siguienteTurno;
    private Semaphore platos;
    private Semaphore espera;

    public Comedor(int cantidad, String turno, String siguienteTurno) {
        this.turno = turno;
        this.siguienteTurno = siguienteTurno;
        this.platos = new Semaphore(cantidad);
        this.espera = new Semaphore(0);
    }

    public boolean entrada(String tipo) throws Exception {
        boolean flag = true;
        this.puedePasar(tipo);
        if (!platos.tryAcquire()) {
            espera.acquire();
            flag = false;
        }
        return flag;
    }

    private void puedePasar(String tipo) throws Exception {
        if (!this.turno.equals(tipo)) {
            espera.acquire();
        }
    }

    public void seVa() {
        if (platos.availablePermits() == 0) {
            //Turno de otro animal.
            String aux = this.turno;
            this.turno = this.siguienteTurno;
            this.siguienteTurno = aux;
            //Se genera un deadLock si platos =0. 
            platos.release(2 + (int) Math.random() * 9);
            espera.release(espera.availablePermits());
        }
    }
}
