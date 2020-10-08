/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

import tp5.ejercicio13.*;

/**
 *
 * @author Dan
 */
public class Mozo extends Trabajador {

    public Mozo(String nombre) {
        super(nombre);
    }

    @Override
    void accion() {
        try {
            if (this.unaConfiteria.pedidoBebida()) {
                System.out.println("Mozo :" + this.nombre + " Buenos dias");
                this.unaConfiteria.mozoAtiendeCliente();
            } else {
                System.out.println("Mozo :"+this.nombre+" No hay clientes seguire haciendo mis hobbies.");
            }
            Thread.sleep(5000);
            this.accion();
        } catch (Exception e) {
            System.out.println("El cliente se canso de esperar y se fue.");
            System.out.println(e);
        }
    }
}
