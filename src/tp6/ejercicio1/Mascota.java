/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6.ejercicio1;

/**
 *
 * @author Dan
 */
public class Mascota extends Thread {

    private String tipo;
    private Comedor unComedero;

    public Mascota(String tipo, Comedor unComedor) {
        this.tipo = tipo;
        this.unComedero = unComedor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            while (true) {
                unComedero.entrada(this.tipo);
                System.out.println("Aninmal Comiendo.");
                System.out.println(tipo + " :" + Thread.currentThread().getName());
                unComedero.seVa();
                System.out.println("Animal yendose.");
                System.out.println(tipo + " :" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println("ERROR :" + e+" :"+Thread.currentThread().getName());
        }
    }

}
