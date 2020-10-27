/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.octubre;

/**
 *
 * @author Grupo 1
 */
public class Buffer {

    /**
     * Segun la definicion un buffer tiene un espacio finito. asi que para la
     * implementacion se usara un array, (:
     *
     * un buffer no deberia saber cuantos productores ni consumidores tiene, un
     * buffer solo sabe que pedir (consumidor/productor) en base a su espacio.
     *
     * un consumidor no deberia saber cuanto puede consumir. un productor no
     * deberia saber cuanto debe producir
     *
     */
    private int tamaño;
    private int indice;

    public Buffer(int tamaño) {
        this.tamaño = tamaño;
        this.indice = 0;

    }

    public synchronized void genera() throws Exception {
        //Estoy lleno?
        if (indice + 1 < this.tamaño) {
            //Que bien tengo espacio creare un numero y lo guardare!
            this.indice++;
            System.out.println("Productor: +1 " + this.ocupacion());
            //Si alguien quiere un numero puedo avisarle que ya tengo uno!
            this.notify();
        } else {
            //No tengo suficiente espacio esperare a que alguien se lo lleve.
            this.wait();
            //Bueno se que hay un espacio para mi. peleare por mi espacio!
        }

    }

    public synchronized void consume() throws Exception {
        //Tengo algo para dar?
        if (this.indice > 0 ) {
            //Que bien tengo un numero para poder entregar
            this.indice--;
            System.out.println("Consumidor: -1 " + this.ocupacion());
            //Si tal vez alguien quiere agregar un numero le avisare!
            this.notify();
        } else {
            //No tengo numeros disponibles esperare a que tenga uno
            this.wait();
            //Bueno se que algo para consumir! peleare por mi producto
        }

    }

    public synchronized int ocupacion() {
        return this.indice;
    }
}
