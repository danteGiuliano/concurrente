/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio4;

import java.util.Random;

/**
 *
 * @author Dan
 */
public class Vehiculo implements Runnable {

    private String patente;
    private String marca;
    private String modelo;
    private int kmFaltantesParaService;
    private Surtidor estacion;

    public Vehiculo(String patente, String marca, String modelo, int kmFaltantesParaService, Surtidor unSurtidor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kmFaltantesParaService = kmFaltantesParaService;
        this.estacion = unSurtidor;

    }

    public void run() {
        try {
            System.out.println("Auto: " + this.marca + " Listo.");
            Thread.sleep(100);
            while (true) {
                this.recorrido();
            }
        } catch (Exception e) {
            System.out.println("Error en el auto de modelo: " + this.marca);
        }
    }

    private void recorrido() throws Exception {
        if (this.kmFaltantesParaService > 0) {
            this.kmFaltantesParaService = this.kmFaltantesParaService - 1;
        } else {
            System.out.println(this.marca + ": Esta en el surtidor ");
            this.kmFaltantesParaService = estacion.cargarCombustible(200);
            System.out.println(this.marca + ": Tanque cargado.");
            Thread.sleep(1000);
        }
    }

}
