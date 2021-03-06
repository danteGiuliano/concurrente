/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio6;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        Cadena palabra = new Cadena("ABBECCC", 2);
        Letra a = new Letra('A', palabra);
        Letra b = new Letra('B', palabra);
        Letra c = new Letra('C', palabra);
        Letra e= new Letra('E',palabra);

        Letra alfabeto[] = {a, b, c,e};

        Thread misHilos[] = new Thread[4];

        for (int i = 0; i < misHilos.length; i++) {
            misHilos[i] = new Thread(alfabeto[i]);
        }
        try {
            for (Thread hilo : misHilos) {
                hilo.start();
            }
            for (Thread hilo : misHilos) {
                hilo.join();
            }
            System.out.println("La palabra es: " + palabra.getCadena());
        } catch (Exception exception) {
            System.out.println("Error en el hilo: " + Thread.currentThread().getName());
        }

    }
}
