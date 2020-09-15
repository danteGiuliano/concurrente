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
public class Salida extends Puerta {

    public Salida(String nombre, Estacionamiento unEstacionamiento, boolean tipo) {
        super(nombre, unEstacionamiento, tipo);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
   void accion() {
        if (tipo) {
            if (this.estacionamineto.ocupacionMoto()) {
                System.out.println("Sacando una moto por: " + Thread.currentThread().getName());
                
                this.estacionamineto.saleMoto();
            }
        } else {
            if (this.estacionamineto.ocupacionAuto()) {
                System.out.println("Sacando un auto por: " + Thread.currentThread().getName());
                this.estacionamineto.saleAuto();
            }
        }
    }

}
