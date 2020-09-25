/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.estacionamientoSemaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Dan
 */
public class Estacionamiento {

    private final int MAX_AUTO = 10;
    private final int MAX_MOTO = 10;
    private int ocupacionMoto;
    private int ocupacionAuto;
    private Semaphore semAutoNorte;
    private Semaphore semAutoSur;
    private Semaphore semMoto;

    public Estacionamiento() {
        this.ocupacionAuto = 0;
        this.ocupacionMoto = 0;
        this.semAutoNorte = new Semaphore(1);
        this.semAutoSur = new Semaphore(1);
        this.semMoto = new Semaphore(1);
    }

    public void saleAuto() {
        if (this.ocupacionMoto > 0) {
            if (this.semAutoNorte.tryAcquire() || this.semAutoSur.tryAcquire()) {
                System.out.println("Sale Auto por: " + Thread.currentThread().getName());
                this.ocupacionAuto = this.ocupacionAuto - 1;
                this.semAutoSur.release();
                this.semAutoNorte.release();
            }

        }
    }

    public void saleMoto() {
        if (this.ocupacionMoto > 0) {
            if (this.semMoto.tryAcquire()) {
                System.out.println("Sale moto por: " + Thread.currentThread().getName());
                this.ocupacionMoto = this.ocupacionMoto - 1;
                this.semMoto.release();
            }
        }
    }

    public void entraMoto() {
        if (this.espacioAuto()) {
            if (this.semMoto.tryAcquire()) {
                System.out.println("Entrando moto por: " + Thread.currentThread().getName());
                this.estacionaMoto();
                this.semMoto.release();
            } else {
                System.err.println("Hay motos en cola.");
            }
        } else {
            System.out.println("No hay espacio para motos");
        }
    }

    public void entraAuto(String id) throws Exception {
        if (this.espacioAuto()) {
            if (id.equals("Entrada Sur")) {
                if (semAutoSur.tryAcquire()) {
                    System.out.println("Estacionando auto por: " + Thread.currentThread().getName());
                    this.estacionaAuto();
                    semAutoSur.release();
                } else {
                    System.out.println("Entrada: " + Thread.currentThread().getName() + " Ocupada.");
                }
            }
            if (id.equals("Entrada Norte")) {
                if (semAutoNorte.tryAcquire()) {
                    System.out.println("Estacionando auto por: " + Thread.currentThread().getName());
                    this.estacionaAuto();
                    semAutoNorte.release();
                } else {
                    System.err.println("Entrada: " + Thread.currentThread().getName() + " Ocupada.");
                }
            }
        } else {
            System.out.println("Estacionamiento lleno!");
        }
    }

    public boolean espacioAuto() {
        return this.ocupacionAuto <= this.MAX_AUTO;
    }

    public boolean espacioMoto() {
        return this.ocupacionMoto <= this.MAX_AUTO;
    }

    private void estacionaAuto() {
        this.ocupacionAuto = this.ocupacionAuto + 1;
    }

    private void estacionaMoto() {
        this.ocupacionMoto = this.ocupacionMoto + 1;
    }
}
