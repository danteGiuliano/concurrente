/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6.ejercicio1;

/**
 *
 * @author Dan
 */
public class Main {

    public static Comedor unComedor = new Comedor(4, "perro", "gato");

    public static void main(String[] args) {

        inicializarMascota(new Mascota[4], "perro");
        inicializarMascota(new Mascota[3], "gato");
    }

    public static void inicializarMascota(Mascota array[], String tipo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Mascota(tipo, unComedor);
            array[i].start();
        }
    }
}
