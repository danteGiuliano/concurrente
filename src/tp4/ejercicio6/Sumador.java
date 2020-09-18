/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio6;

/**
 *
 * @author Dan
 */
public class Sumador implements Runnable{
private Dato dato;
    public Sumador(Dato unDato,int grupo) {
    this.dato=unDato;
    }

    @Override
    public void run() {
        try{
            
        }catch(Exception e){
            System.out.println("Error en el hilo: "+Thread.currentThread().getName());
        }
    }
    
}
