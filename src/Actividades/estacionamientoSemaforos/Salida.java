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
public class Salida extends Puerta {

    public Salida(String nombre, Vehiculo tipo, Estacionamiento parque) {
        super(nombre, tipo, parque);
    }

    @Override
    public void accion() {
        if (tipo.esAuto()) {
            parque.saleAuto();
        } else {
            parque.saleMoto();
        }
    }
}
