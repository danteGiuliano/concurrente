/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio6;

import java.util.Random;

/**
 *
 * @author Dan
 */
public class Dato {

    private int array[];
    private int sumaTotal;
    private int sumaVerdadera;

    public Dato(int num) {
        Random rd = new Random();
        array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = rd.nextInt(10);
        }
        this.sumaVerdadera=0;
        for (int i = 0; i < num; i++) {
            this.sumaVerdadera += this.array[i];
        }
    }

    public int obtenerValor(int num) {
        return array[num];
    }

    public synchronized void sumaParcial(int num) {
        sumaTotal = sumaTotal + num;
    }
}
