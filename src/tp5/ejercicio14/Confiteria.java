/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Dan
 */
public class Confiteria {

    /**
     * Secuencia de semaforos. No hay cliente pidenBebida pidenBebida y comida
     * pidenComida atencionMozo = 1 0 0 1 pedidoBeber = 0 0 0 0 atencionCocinero
     * = 1 1 0 0 pedidoComida = 0 0 0 0
     */
    private Semaphore atencionMozo;
    private Semaphore atencionCocinero;
    private Semaphore pedidoBeber;
    private Semaphore pedidoComida;
    private Silla sillas;

    public Confiteria() {
        this.sillas = new Silla(6);
        this.atencionMozo = new Semaphore(1); //Disparador de mozo.
        this.atencionCocinero = new Semaphore(1); //Disparador de cocinero
        this.pedidoBeber = new Semaphore(0,true); //control de Mozo.
        this.pedidoComida = new Semaphore(0,true);//Control de cocinero
    }

    public boolean espacioConfiteria() {
        return sillas.hayEspacio();
    }

    public void hayLugarParaBeber() {
        this.sillas.ocupaSilla();
        this.pedidoBeber.release();
    }

    public void hayLugarParaComer() {
        this.sillas.ocupaSilla();
        this.pedidoComida.release();
    }

    public void pedidoBebida() throws Exception {
        this.pedidoBeber.acquire();
    }

    public void pedidoComida() throws Exception {
        this.pedidoComida.acquire();
    }

    public void mozoAtiendeCliente() throws Exception {
        System.out.println("Mozo apunta el pedido del cliente. ");
        Thread.sleep(1000);
        System.out.println("Mozo Sirviendo bebida");
        Thread.sleep(1000);
        System.out.println("Cliente tomando.");
        Thread.sleep(3000);
        this.atencionMozo.release();
    }

    public void cocineroAtiendeCliente() throws Exception {
        System.out.println("Cocinero apunta el pedido del cliente ");
        Thread.sleep(1000);
        System.out.println("cocinero sirviendo comida");
        Thread.sleep(1000);
        System.out.println("Cliente Comiendo.");
        Thread.sleep(3000);
        this.atencionCocinero.release();
    }

}
