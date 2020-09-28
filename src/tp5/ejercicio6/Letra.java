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
public class Letra implements Runnable {

    private char unaLetra;
    private Cadena lenguaje;

    public Letra(char unaLetra, Cadena lenguaje) {
        this.unaLetra = unaLetra;
        this.lenguaje = lenguaje;
    }

    @Override
    public void run() {

        try {
            System.out.println("Hilo: " + this.unaLetra + " Listo!");
            int aux = this.lenguaje.rutina(), i = 1;
            while (i <= aux) {
                this.lenguaje.escribir(unaLetra);
                i++;
                Thread.sleep(100);
            }

        } catch (Exception e) {
            System.out.println("Error en el hilo.: " + Thread.currentThread().getName());
        }

    }

}
