/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej5;

/**
 *
 * @author Dan
 */
public class TesteoRecurso {

    public static void main(String[] args) {
        int contador = 0;
        Cliente juan = new Cliente();
        Cliente ines = new Cliente();
        Cliente clientes[] = {juan, ines};

        Thread hilos[] = new Thread[1];
        for (Thread i : hilos) {
            i = new Thread(clientes[contador]);
        }
        for (Thread i : hilos) {
            i.start();
        }

    }

}
