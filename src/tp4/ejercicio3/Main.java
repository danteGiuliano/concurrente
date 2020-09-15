/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio3;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        int turnos[] = {1, 2, 3};

        Cadena cadena = new Cadena(3);
        Letra A = new Letra('A', 1, cadena);
        Letra B = new Letra('B', 2, cadena);
        Letra C = new Letra('C', 3, cadena);

        Letra letras[] = {A, B, C};

        Thread hilos[] = new Thread[3];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(letras[i]);
        }

        for (Thread misHilos : hilos) {
            misHilos.start();
        }
        try {
            for (Thread misHilos : hilos) {
                misHilos.join();
            }
            System.out.println("La cadena es: " + cadena.obtenerCadena());
        } catch (Exception e) {
            System.out.println("Fallo en un hilo");
        }

    }
}
