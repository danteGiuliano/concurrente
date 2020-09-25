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
public class Vehiculo {

    boolean tipo;

    public Vehiculo(String tipo) {
        switch (tipo) {
            case "moto":
                this.tipo = true;
                break;
            case "auto":
                this.tipo = false;
                break;

        }
    }

    public boolean esAuto() {
        return !tipo;
    }

    public boolean esMoto() {
        return tipo;
    }
}
