/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.octubre;

/**
 *
 * @author Grupo1
 */
public class Main {

    public static void main(String[] args) {
        Buffer unBuffer = new Buffer(100);

        Consumidor misConsumidores[] = new Consumidor[20];
        Productor misProductores[] = new Productor[30];

        for (int i = 0; i < misConsumidores.length; i++) {
            misConsumidores[i] = new Consumidor(unBuffer);
        }
        for (int i = 0; i < misProductores.length; i++) {
            misProductores[i] = new Productor(unBuffer);
        }
        for (Consumidor unConsumidor : misConsumidores) {
            unConsumidor.start();
        }
        for (Productor unProductor : misProductores) {
            unProductor.start();
        }
    }
}
