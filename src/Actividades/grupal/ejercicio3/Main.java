/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.ejercicio3;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {

        String nombreCliente[] = {"Jeremias", "Andres", "Erick", "Marianno", "Julian", "Silvia",
            "Agustin", "Valeria", "Juan", "Dante", "Rodrigo", "Dana", "Denisse", "Dennise",
             "Pepe", "Etc sech"};

        String nombreBarbero[] = {"Manolo", "Pepo", "Adriano", "Kaka"};
        System.out.println(nombreBarbero[1]);
        int sillas = 3;
        Barberia unaBarberia = new Barberia(sillas);

        Cliente clientes[];
        clientes = new Cliente[nombreCliente.length];
        Barbero barberos[] = new Barbero[nombreBarbero.length];
        Thread misHilos[] = new Thread[clientes.length + barberos.length];

        for (int i = 0; i < nombreCliente.length; i++) {
            clientes[i] = new Cliente((Colores.colorAleatorio(nombreCliente[i])), unaBarberia);
        }
        for (int i = 0; i < nombreBarbero.length; i++) {
            barberos[i] = new Barbero((Colores.colorAleatorio(nombreBarbero[i])), unaBarberia);
        }
        int i = 0, j = barberos.length;
        while (i < j) {
            misHilos[i] = new Thread(barberos[i]);
            i++;
        }
        j =barberos.length+clientes.length-5;
        while (i < j) {
            misHilos[i] = new Thread(clientes[i]);
            i++;
        }
        for (Thread hilo : misHilos) {
            hilo.start();
        }
    }
}
