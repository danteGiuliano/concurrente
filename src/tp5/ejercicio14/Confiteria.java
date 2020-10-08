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
     * Secuencia de semaforos. No hay cliente  pidenBebida  pidenBebida y comida  pidenComida
     * atencionMozo     =              1            0                0                 1 
     * pedidoBeber      =              0            0                0                 0
     * atencionCocinero =              1            1                0                 0
     * pedidoComida     =              0            0                0                 0 
     */

    private Semaphore atencionMozo;
    private Semaphore atencionCocinero;
    private Semaphore pedidoBeber;
    private Semaphore pedidoComida;
    private String clienteParaMozo;
    private String clienteParaCocinero;

    public Confiteria() {
        this.atencionMozo = new Semaphore(1); //Disparador de mozo.
        this.atencionCocinero=new Semaphore(1); //Disparador de cocinero
        this.pedidoBeber = new Semaphore(0); //control de Mozo.
        this.pedidoComida=new Semaphore(0);//Control de cocinero
    }

    public boolean hayLugarParaBeber() {
        boolean flag = atencionMozo.tryAcquire();
        if (flag) {
            this.pedidoBeber.release();
        }
        return flag;
    }
    public boolean hayLugarParaComer(){
        boolean flag=atencionCocinero.tryAcquire();
        if(flag){
            this.pedidoComida.release();
        }
        return flag;
    }

    public boolean pedidoBebida() {
        return this.pedidoBeber.tryAcquire();
    }

    public boolean pedidoComida() {
        return this.pedidoComida.tryAcquire();
    }

    public void mozoAtiendeCliente() throws Exception {
        System.out.println("Mozo apunta el pedido del cliente. " +this.clienteParaMozo);
        Thread.sleep(1000);
        System.out.println("Mozo Sirviendo bebida");
        Thread.sleep(1000);
        System.out.println("Cliente tomando.");
        Thread.sleep(3000);
        this.atencionMozo.release();
    }
    public void cocineroAtiendeCliente() throws Exception {
        System.out.println("Cocinero apunta el pedido del cliente " + this.clienteParaCocinero);
        Thread.sleep(1000);
        System.out.println("cocinero sirviendo comida");
        Thread.sleep(1000);
        System.out.println("Cliente Comiendo.");
        Thread.sleep(3000);
        this.atencionCocinero.release();
    }

    public void clienteParaMozo(String nombre) {
        this.clienteParaMozo = nombre;
    }

    public void clienteParaCocinero(String nombre) {
        this.clienteParaCocinero = nombre;
    }
}
