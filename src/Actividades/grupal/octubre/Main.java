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
        consumidor(unBuffer);
        productor(unBuffer);
    }

    public static void consumidor(Buffer unBuffer) {
        Consumidor misConsumidores[] = new Consumidor[2];
        
        for (int i = 0; i < misConsumidores.length; i++) {
            misConsumidores[i] = new Consumidor(unBuffer);
        }
        
        for (Consumidor unConsumidor : misConsumidores) {
            unConsumidor.start();
        }
    }

    public static void productor(Buffer unBuffer) {
        Productor misProductores[] = new Productor[2];

        for (int i = 0; i < misProductores.length; i++) {
            misProductores[i] = new Productor(unBuffer);
        }

        for (Productor unProductor : misProductores) {
            unProductor.start();
        }
    }
}
