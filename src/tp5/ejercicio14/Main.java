/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        Colores c0 = new Colores("verde");
        Colores c1 = new Colores("amarillo");

        Confiteria unaConfiteria = new Confiteria();
//Inicializacion empleados.
        String nombres[] = {c0.pintar("Pedro"), c0.pintar("Jota"), c0.pintar("Floriana"),
            c0.pintar("Mariano"), c0.pintar("Juan"), c0.pintar("Agustin"), c0.pintar("Ricardo")};

        Empleado empleados[] = new Empleado[nombres.length];

        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado(nombres[i]);
        }
//Inicializacion mozo y cocinero
        Mozo unMozo = new Mozo(c1.pintar("Amador"));
        unMozo.setConfiteria(unaConfiteria);
        Cocinero unCocinero = new Cocinero(c1.pintar("Tutuk"));
        unCocinero.setConfiteria(unaConfiteria);
//Hilos
        Thread misHilos[] = new Thread[empleados.length];

//Setear la confiteria
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].setConfiteria(unaConfiteria);
        }
        for (int i = 0; i < misHilos.length; i++) {
            misHilos[i] = new Thread(empleados[i]);
        }
//Run.
        Thread hiloCocinero = new Thread(unCocinero);
        Thread hiloMozo = new Thread(unMozo);
        hiloCocinero.start();
        hiloMozo.start();
        for (Thread hilo : misHilos) {
            hilo.start();
        }
    }
}
