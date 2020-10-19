/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.ejercicio3;

/**
 *
 * @author Dan
 */
public abstract class Persona implements Runnable {

    protected String nombre;
    protected Barberia unaBarberia;
    protected final String DATA_CLASS;

    public Persona(String nombre, Barberia unaBarberia) {
        this.nombre = nombre;
        this.unaBarberia = unaBarberia;
        this.DATA_CLASS = this.getClass().getSimpleName() + " :" + this.nombre;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.DATA_CLASS + " Listo!");
            Thread.sleep(100);
            while (true) {
                this.accion();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error en " + this.DATA_CLASS);
        }
    }

    public abstract void accion() throws Exception;
}
