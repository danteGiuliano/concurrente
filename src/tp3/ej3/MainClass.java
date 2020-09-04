/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej3;

/**
 *
 * @author Dan
 */
public class MainClass {

    public static void main(String[] args) {
        PingPong t1 = new PingPong("PING", 1);
        PingPong t2 = new PingPong("PONG", 1);
        PingPong t3 = new PingPong("PANG", 1);
        PingPong t4 = new PingPong("PUNG", 1);
        PingPong array[]= {t1,t2,t3,t4};
        // Activación
        for (PingPong i : array) {
            i.start();
        }
        // Espera unos segundos
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en sleep ");
        };
    }

        /**
         *  for (int i = 0; i < 30; i++) {
            t1.start();
            t2.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Error en sleep");
            };
        }
        * 
        * Lanza un error por el start?
         */
        
        /**
         * t1.start();
           t2.start();
         * 
         * 
         *  for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Error en sleep");
            };
        }
        * 
        * espera el sleep 5000*30.
         */
    }

