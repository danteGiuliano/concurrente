/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

import java.util.Random;

/**
 *
 * @author Dan
 */
public class Empleado extends Trabajador {

    public Empleado(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void accion() {
        try {
            System.out.println(this.getClass().getSimpleName() + " " + this.nombre + " Se acerca al local");
            Random rd = new Random();
            if (rd.nextBoolean()) {
                this.unaConfiteria.hayLugarParaBeber();
                System.out.println(this.nombre + ": voy a ocupar un lugar (:");
                System.out.println(this.nombre + ": Voy a pedir una bebida.");
                Thread.sleep(1000);
            }
            if (rd.nextBoolean()) {
                this.unaConfiteria.hayLugarParaComer();
                System.out.println(this.nombre + ": voy a ocupar un lugar (:");
                System.out.println(this.nombre + ": Voy a pedir algo para comer.");
                Thread.sleep(1000);
            }
            Thread.sleep(100);
            this.accion();
        } catch (Exception e) {
            System.out.println("Error en el Thread. " + Thread.currentThread().getName());
            System.out.println(e);
        }
    }

}
