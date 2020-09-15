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
public abstract class Puerta implements Runnable {

    protected String nombre;
    protected Estacionamiento estacionamineto;
    protected boolean tipo;

    
    public Puerta(String nombre,Estacionamiento unEstacionamiento,boolean tipo){
        this.nombre=nombre;
        this.estacionamineto=unEstacionamiento;
        this.tipo=tipo;//True motos, false Autos.
    }
    public void run() {
        try {
            System.out.println(this.nombre + ": Listo");
            Thread.sleep(10);
            for (int i = 0; i < 10; i++) { 
                this.accion(); 
                Thread.sleep(1000);
            }
               
            
        } catch (Exception e) {
            System.out.println("Error en " + Thread.currentThread().getName());
        }
    }

    protected boolean hayLugar() {
        if (tipo) {
            return this.estacionamineto.hayEspacioMoto();
        } else {
            return this.estacionamineto.hayEspacioAuto();
        }

    }
    public String getName(){
        return this.nombre;
    }

    abstract  void accion();
}
