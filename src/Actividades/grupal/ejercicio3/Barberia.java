/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.ejercicio3;

import java.util.concurrent.Semaphore;

// La barbería tiene un sala de espera y cada cliente que quiere cortarse suma 1 al contador "clientesEsperando".
public class Barberia {

    private Semaphore semSillon; // Indica si el sillón está ocupado con un cliente. 1 = está libre. Usado para exclusión mutua del sillón.                           
    private Semaphore semBarbero; // Indica si el barbero está durmiendo. 0 = está durmiendo. Usado para indicarle al barbero cuando empezar a trabajar. 
    private Semaphore semPaga;

    public Barberia(int cantidadSillas) {
        this.semSillon = new Semaphore(cantidadSillas);
        this.semBarbero = new Semaphore(0);
        this.semPaga = new Semaphore(0);
    }

    // Si el barbero está ocupado con un cliente, los otros esperan su turno en una silla. Luego se pelean por ser los proximos en atenderse.
    public void entrarBarberia(String data) throws Exception {
        semSillon.acquire();
        System.out.println(data + " le indica al barbero que quiere cortarse el pelo");
        System.out.println(data + " se empieza a acomodar en la silla...");
        semBarbero.release();   // Da permiso al barbero a proceder.
        this.semPaga.acquire();
        System.out.println(data + " se para, paga y se va.");
        semSillon.release();
    }

    // El barbero trabaja en los clientes hasta que ya no haya más en la sala de espera.
    public void cortarPelo(String data) throws Exception {
        semBarbero.acquire();
        System.out.println(data + " se espabila y comienza a trabajar");
        Thread.sleep(1000);
        System.out.println(data + " recorta las patillas");
        Thread.sleep(3000);     //El barbero está laburando
        System.out.println(data + " desmecha el flequillo");
        Thread.sleep(2000);     //El barbero está laburando
        System.out.println(data + " termina");
        this.semPaga.release();
    }

}
