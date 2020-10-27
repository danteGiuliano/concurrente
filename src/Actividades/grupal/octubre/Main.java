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
        consumidor(unBuffer,2);
        productor(unBuffer,2);
    }

    public static void consumidor(Buffer unBuffer,int num) {
        Consumidor misConsumidores[] = new Consumidor[num];
        
        for (int i = 0; i < misConsumidores.length; i++) {
            misConsumidores[i] = new Consumidor(unBuffer);
        }
        
        for (Consumidor unConsumidor : misConsumidores) {
            unConsumidor.start();
        }
    }

    public static void productor(Buffer unBuffer,int num) {
        Productor misProductores[] = new Productor[num];

        for (int i = 0; i < misProductores.length; i++) {
            misProductores[i] = new Productor(unBuffer);
        }

        for (Productor unProductor : misProductores) {
            unProductor.start();
        }
    }
}
