/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio4;

import java.util.Random;

/**
 *
 * @author Dan
 */
public class Surtidor {

    private boolean ocupado;
    private String nombre;

    public Surtidor(String nombre) {
        this.ocupado = false;
        this.nombre = nombre;
    }

    public boolean estaOcupado() {
        return this.ocupado;
    }
    public synchronized void ocuparSurtidor(boolean flag){
        this.ocupado=flag;
    }

    public synchronized int cargarCombustible(int cantidad) throws Exception {
        Random rd = new Random();
        int num = cantidad + rd.nextInt(400);
        Thread.sleep(num);
        return num;
    }
}
