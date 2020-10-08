/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

import java.util.Random;
import tp5.ejercicio13.*;

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
                if (this.unaConfiteria.hayLugarParaBeber()) {
                    System.out.println(this.nombre + ": Esperare a que el mozo tome mi orden");
                    System.out.println(this.nombre + ": Voy a pedir una bebida.");
                    this.unaConfiteria.clienteParaMozo(nombre);
                } else {
                    System.out.println(this.nombre + ": No hay lugar volvere en 15 min ");
                    Thread.sleep(10000);
                    this.accion();
                }
            }
            if (rd.nextBoolean()) {
                if (this.unaConfiteria.hayLugarParaComer()) {
                    System.out.println(this.nombre + ": Esperare a que el cocinero tome mi orden");
                    System.out.println(this.nombre + ": Voy a pedir algo para comer.");
                    this.unaConfiteria.clienteParaCocinero(nombre);
                } else {
                    System.out.println(this.nombre + ": No hay lugar volvere en 15 min ");
                    Thread.sleep(10000);
                    this.accion();
                }
            }
        } catch (Exception e) {
            System.out.println("Error en el Thread. " + Thread.currentThread().getName());
            System.out.println(e);
        }
    }

}
