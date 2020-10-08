/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio12;

/**
 *
 * @author Dan
 */
public class Hamster implements Runnable {
    String nombre;
    Jaula unaJaula;

    public Hamster(String nombre, Jaula unaJaula) {
        this.nombre = nombre;
        this.unaJaula = unaJaula;
    }

    @Override
    public void run() {
        try{
            System.out.println("Haster: "+this.nombre+" Listo.");
            Thread.sleep(10);
            while(true){
                System.out.println("Hamster: "+this.nombre+" quiere comer del plato"); 
                this.unaJaula.comerEnPlato(nombre);
                System.out.println("Hamster: "+this.nombre+" quiere dormir!");
                this.unaJaula.descanzarHamaca(nombre);
                System.out.println("Hamster: "+this.nombre+" quiere correr en la rueda");
                this.unaJaula.correrEnRueda(nombre);
            }
        }catch (Exception e){
            System.out.println("Error en "+Thread.currentThread().getName());
        }
    }
    
}
