/*

 */
package Actividades.segunda;

import Actividades.primera.Dato;

/**
 *
 * @author Dan
 */
public class Contador {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            final Dato unContador = new Dato();

            RunnableCdor unRunCdor = new RunnableCdor(unContador);

            Thread h1 = new Thread((Runnable) unRunCdor);
            Thread h2 = new Thread((Runnable) unRunCdor);
            h1.start();
            h2.start();
            h1.join();
            h2.join();
            System.out.println("en main-" + unContador.obtenerValor());
        }

    }

}
