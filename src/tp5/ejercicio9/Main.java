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
public class Main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Taxista taxista = new Taxista(taxi);
        Persona persona = new Persona(taxi);

        Thread hilos[] = new Thread[2];
        hilos[0] = new Thread(taxista);
        hilos[1] = new Thread(persona);

        for (Thread misHilos : hilos) {
            misHilos.start();
        }
    }
}
