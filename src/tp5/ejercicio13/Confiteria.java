/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio13;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Dan
 */
public class Confiteria {

    /**
     * Secuencia de semaforos. No hay cliente hayCliente Cliente atendiendo
     * pideAtencion = 1 0 0 hayCliente = 0 1 0
     *
     */

    private Semaphore pideAtencion;
    private Semaphore hayCliente;
    private String ultimoCliente;

    public Confiteria() {
        this.pideAtencion = new Semaphore(1); //Disparador de cliente.
        this.hayCliente = new Semaphore(0); //control de Mozo.
    }

    public boolean hayLugar() {
        boolean flag = pideAtencion.tryAcquire();
        if (flag) {
            this.hayCliente.release();
        }
        return flag;
    }

    public boolean hayCliente() {
        return this.hayCliente.tryAcquire();
    }

    public void mozoAtiendeCliente() throws Exception {
        System.out.println("Mozo apunta el pedido del cliente. " + ultimoCliente);
        Thread.sleep(1000);
        System.out.println("Mozo Sirviendo bebida");
        Thread.sleep(1000);
        System.out.println("Cliente tomando.");
        Thread.sleep(3000);
        System.out.println("Cliente satisfecho, paga y se va.");
        this.hayCliente.release(0);
        this.pideAtencion.release();
    }

    public void ultimoCliente(String nombre) {
        this.ultimoCliente = nombre;
    }
}
