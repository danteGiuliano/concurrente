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
public class Entrada extends Puerta {

    public Entrada(String nombre, Vehiculo tipo, Estacionamiento parque) {
        super(nombre, tipo, parque);
    }

    @Override
    void accion() {
            if (tipo.esAuto()) {
                if (parque.espacioAuto()) {
                    parque.entraAuto(this.nombre);
                }
            } else {
                if (parque.espacioMoto()) {
                    parque.entraMoto();
                }
            }
    }

}
