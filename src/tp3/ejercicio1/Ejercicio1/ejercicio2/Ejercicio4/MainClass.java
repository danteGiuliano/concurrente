/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio1.Ejercicio1.ejercicio2.Ejercicio4;

/**
 *
 * @author Dan
 */
public class MainClass {

    public static void main(String[] args) {
        PingPong t1 = new PingPong("PING",33);
        PingPong t2 = new PingPong("PONG",10);
        // Activación
        t1.start();
        t2.start();
        // Espera unos segundos
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error en sleep");
        };
        // Finaliza la ejecución de los threads

    }
}
