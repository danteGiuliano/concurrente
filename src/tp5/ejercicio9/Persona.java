/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio9;

/**
 *
 * @author Dan
 */
public class Persona implements Runnable {

    private Taxi taxi;

    public Persona(Taxi taxi) {
        this.taxi = taxi;
    }

    public void run() {
        try {
            System.out.println("Persona Lista.");
            Thread.sleep(100);
            System.out.println("Persona: *paseando*");
            Thread.sleep(1000);
            int i = 0;
            while (true) {
                this.taxi.subePasajero();
                System.out.println("Pesona: " + i + " se subio al taxi");
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
