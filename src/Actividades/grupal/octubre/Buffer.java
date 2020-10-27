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
    private int array[];
    private int index;

    public Buffer(int size) {
        this.array = new int[size];
        this.index = 1;

    }

    public synchronized void genera() throws Exception {
        //Estoy lleno?
        if (index + 1 < this.array.length) {
            //Que bien tengo espacio creare un numero y lo guardare!
            this.index++;
            this.array[index] = Math.round(10);
            //Si alguien quiere un numero puedo avisarle que ya tengo uno!
            this.notify();
        } else {
            //No tengo suficiente espacio esperare a que alguien se lo lleve.
            this.wait();
            //Bueno se que hay un espacio para mi. peleare por mi espacio!
            this.genera();
        }
        System.out.println("Productor: +1 " + this.ocupacion());
    }

    public synchronized void consume() throws Exception {
        //Tengo algo para dar?
        if (index > 0) {
            //Que bien tengo un numero para poder entregar
            this.index--;
            //Si tal vez alguien quiere agregar un numero le avisare!
            this.notify();
        } else {
            //No tengo numeros disponibles esperare a que tenga uno
            this.wait();
            //Bueno se que algo para consumir! peleare por mi producto
            this.consume();
        }
        System.out.println("Consumidor: -1 " + this.ocupacion());
    }

    public synchronized int ocupacion() {
        return this.index;
    }
}
