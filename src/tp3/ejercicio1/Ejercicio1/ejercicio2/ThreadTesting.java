/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio1.Ejercicio1.ejercicio2;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
class ThreadTesting {


    public static void main(String[] args) {
        Colores rojo = new Colores("rojo");
        for (int i = 0; i < 10; i++) {
            Thread miHilo = new MiEjecucion();
            try {
                miHilo.start();
                miHilo.join();
            } catch (Exception e) {
                System.err.println("Ocurrio un error a la espera :/");
            }

            System.out.println(rojo.pintar("En el main"));
        }

    }

    /**
     * Lo que sucede es que este algoritmo, crea un hilo. deja que realice la
     * dicha tarea, como la realiza a velocidades muy rapidas, se interpone con
     * la ejecucion es decir la clase main no espera a que miHilo.start termine
     * su ejecucion. solo manda el mensaje para que comience y se desentiende de
     * dicha clase
     *
     */
    /**
     * Posible mejora. utilizar miHilo.Join(); entonces el compilador esperara a
     * que termine dicha ejecucion
     *
     * nota:para usar Join(), debe usarse Excepciones (Todavia no entiendo
     * porque)
     */
}
