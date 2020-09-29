/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio8;

/**
 *
 * @author Dan
 */
public class Carrera {

    public static void main(String[] args) {
        Testigo relevo = new Testigo();
        Atleta corredor1 = new Atleta("Juan");
        Atleta corredor2 = new Atleta("Sofia");
        Atleta corredor3 = new Atleta("Valeria");
        Atleta corredor4 = new Atleta("Mariano");

        Atleta corredores[] = {corredor1, corredor2, corredor3, corredor4};
        Thread hilos[] = new Thread[4];

        for (int i = 0; i < 4; i++) {
            corredores[i].setRelevo(relevo);
            hilos[i] = new Thread(corredores[i]);
            hilos[i].setName(corredores[i].getNombre());
        }
        for (Thread miHilo : hilos) {
            miHilo.start();
        }
        try {
            for (Thread miHilo : hilos) {
                miHilo.join();
            }
        } catch (Exception e) {
            System.out.println("La carrera no finalizo.");
        }
        System.out.println("Los tiempos fueron de: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Corredor: " + corredores[i].getNombre() + " Tiempo: " + corredores[i].tiempoDeCarrera() + " segundos");
        }

    }
}
