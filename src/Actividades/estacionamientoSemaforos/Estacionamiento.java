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
    private Semaphore sem_Auto;
    private Semaphore sem_Moto;

    public Estacionamiento() {
        this.ocupacionAuto = 0;
        this.ocupacionMoto = 0;
    }

    public void saleAuto() {
        this.ocupacionAuto = (this.ocupacionAuto > 0) ? -1 : +0;
    }

    public void saleMoto() {
        this.ocupacionMoto = (this.ocupacionMoto > 0) ? -1 : +0;
    }

    public void entraMoto() {
        this.ocupacionMoto = (this.ocupacionMoto <= this.MAX_MOTO) ? +1 : +0;
    }

    public void entraAuto() {
        this.ocupacionAuto = (this.ocupacionAuto <= this.MAX_AUTO) ? +1 : +0;
    }

    public boolean espacioAuto() {
        return this.ocupacionAuto <= this.MAX_AUTO;
    }

    public boolean espacioMoto() {
        return this.ocupacionMoto <= this.MAX_AUTO;
    }
}
