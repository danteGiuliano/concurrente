/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

/**
 *
 * @author Dan
 */
public class Silla {

    private int cantidad;
    private int ocupacion;

    public Silla(int num) {
        this.cantidad = num;
        this.ocupacion = 0;
    }

    public synchronized void ocupaSilla() {
        this.ocupacion++;
    }

    public synchronized void desocupaSilla() {
        this.ocupacion--;
    }

    public synchronized boolean hayEspacio() {
        return this.ocupacion < cantidad;
    }
}
