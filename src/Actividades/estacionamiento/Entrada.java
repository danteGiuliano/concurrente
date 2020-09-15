/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.estacionamiento;

/**
 *
 * @author Dan
 */
public class Entrada extends Puerta {

    public Entrada(String nombre, Estacionamiento unEstacionamiento, boolean tipo) {
        super(nombre, unEstacionamiento, tipo);
    }

    public void run() {
        super.run();
    }

    void accion() {
        System.out.println("Soy " + Thread.currentThread().getName());
        if (this.hayLugar()) {

            if (tipo) {
                System.out.println("Estacionando moto por entrada: " + Thread.currentThread().getName());
                this.estacionamineto.ingresaMoto();

            } else {
                System.out.println("Estacionando Auto por entrada: " + Thread.currentThread().getName());
                this.estacionamineto.ingresaAuto();
            }
        } else {
            if (tipo) {
                System.err.println("No hay lugar disponible para Motos ");
            } else {
                System.err.println("No hay lugar disponible para Autos");
            }

        }

    }

}
