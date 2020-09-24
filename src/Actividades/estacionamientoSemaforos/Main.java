/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.estacionamientoSemaforos;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        Estacionamiento parque = new Estacionamiento();

        Thread hilos[] = new Thread[5];

        Entrada eMoto = new Entrada("Estrada Motos ", new Vehiculo("moto"), parque);
        Salida salidaM = new Salida("Salida Motos", new Vehiculo("moto"), parque);
        Entrada eSur = new Entrada("Estrada sur", new Vehiculo("auto"), parque);
        Entrada eNorte = new Entrada("Estrada norte", new Vehiculo("auto"), parque);
        Salida salidaA = new Salida("Salida Autos", new Vehiculo("auto"), parque);

        Puerta compuertas[] = {eMoto, eSur, eNorte, salidaM, salidaA};
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(compuertas[i]);
            hilos[i].setName(compuertas[i].getName());
        }
        for (Thread misHilos : hilos) {
            misHilos.start();
        }

    }
}
}
