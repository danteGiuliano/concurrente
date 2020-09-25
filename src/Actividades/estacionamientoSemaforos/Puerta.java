/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.estacionamientoSemaforos;

/**
 *
 * @author Dan
 */
abstract class Puerta implements Runnable {

    protected String nombre;
    protected Vehiculo tipo;
    protected Estacionamiento parque;

    public Puerta(String nombre, Vehiculo tipo, Estacionamiento parque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.parque = parque;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " : Listo!");
            Thread.sleep(10);
            for (int i = 0; i < 5; i++) {
                this.accion();
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.err.println("Error al ejecutar: " + Thread.currentThread().getName());
        }
    }

    abstract void accion();

    public String getName() {
        return this.nombre;
    }
}
