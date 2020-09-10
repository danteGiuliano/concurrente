
package tp4.ejercicio2;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Tablero {

    public static void main(String[] args) {
        Colores rojo = new Colores("rojo");
        Colores amarillo = new Colores("amarillo");
        
        Personaje user = new Personaje("pepito");

        Personaje orco = new Orco(rojo.pintar("Gul'Dan"), user);
        Personaje elfo = new Elfo(amarillo.pintar("Tyrande"), user);
        Personaje entidades[] = {orco, elfo};

        Thread hilos[] = new Thread[2];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(entidades[i]);
        }
        System.out.println("Vida inicial de "+user.obtenerNombre()+": "+user.obtenerVida());
        for (Thread miHilos : hilos) {
            miHilos.start();
        }
    }
}
