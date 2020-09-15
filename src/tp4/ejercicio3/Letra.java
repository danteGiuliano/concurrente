/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio3;

import java.util.Random;

/**
 *
 * @author Dan
 */
public class Letra implements Runnable {

    private char letra;
    private int id;
    private Cadena cadena;

    public Letra(char letra, int turno, Cadena cadena) {
        this.letra = letra;
        this.id = turno;
        this.cadena = cadena;
    }

    public void run() {
        try {
            System.out.println(this.letra + " Lista");
            Thread.sleep(10);

            for (int i = 0; i < 5; i++) {
                if (cadena.verificarTurno(this.id)) {
                    this.cadena.escribir(this.letra);
                    this.cadena.siguienteTurno();
                }
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Error en la letra: " + this.letra);
        }

    }
  
}
