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
public abstract class Trabajador implements Runnable {

    protected String nombre;
    protected Confiteria unaConfiteria;

   
    public Trabajador(String nombre){
        this.nombre=nombre;
    }

    public void run() {
        try {
            System.out.println(this.getClass().getSimpleName() + " : " + this.nombre + " Listo!");
            Thread.sleep(1000);
            this.accion();
        } catch (Exception e) {
            System.out.println("Error en " + Thread.currentThread().getName());
            System.out.println("Clase " + this.getClass().getName());
            System.out.println(e);
        }
    }
    
    public void setConfiteria(Confiteria unaConfiteria){
        this.unaConfiteria=unaConfiteria;
    }
    public String getNombre(){
        return this.nombre;
    }

    abstract void accion();
}
